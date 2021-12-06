package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public Set<Issue> searchByLabel(String label) {
        return repository.findByLabel(label);
    }

    public Set<Issue> searchByAssignee(String assignee) {
        return repository.findByAssignee(assignee);
    }

    public List<Issue> sortManagerAll() {
        return repository.sortAll();
    }

//    public List<Issue> changeManagerStatus(int id) {
//        List<Issue> items = repository.findAll();
//        List<Issue> result = new ArrayList<>();
//
//        for (Issue item : items) {
//            if (item.changeStatus(id)) {
//            }
//        }
////        for (Issue item : items) {
////            System.out.println(item);
////        }
//        return result;
//    }

    public List<Issue> closeIssue(int id) {
        List<Issue> items = repository.findAll();
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.getId() == id) {
                item.close(id);
            }
        }
//        for (Issue item : items) {
//            System.out.println(item);
//        }
        return result;
    }

    public List<Issue> openIssue(int id) {
        List<Issue> items = repository.findAll();
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.getId() == id) {
                item.open(id);
            }
        }
//        for (Issue item : items) {
//            System.out.println(item);
//        }
        return result;
    }

}
