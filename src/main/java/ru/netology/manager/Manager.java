package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void addIssue(Issue issue) {
        repository.save(issue);
    }

    public List<Issue> getAll() {
        return repository.findAll();
    }

    public List<Issue> searchByOpen(String open) {
        return repository.findByOpen(open);
    }

    public List<Issue> searchByClosed(String closed) {
        return repository.findByClosed(closed);
    }

    public List<Issue> searchByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public List<Issue> searchByLabel(String label) {
        return repository.findByLabel(label);
    }

    public List<Issue> searchByAssignee(String assignee) {
        return repository.findByAssignee(assignee);
    }

    public List<Issue> sortManagerAll() {
        return repository.sortAll();
    }

    public List<Issue> changeManagerStatus(int id) {
        List<Issue> items = repository.findAll();
        List<Issue> result = new ArrayList<>();

        for (Issue item : items) {
            if (item.check(id)) {
//                System.out.println("Назначенный найден.");
            }
        }
//        for(Issue item: items){
//            System.out.println(item);
//        }
        return result;
    }

}
