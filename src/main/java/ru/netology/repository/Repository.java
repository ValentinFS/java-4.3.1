package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repository {

    List<Issue> items = new ArrayList<>();

    public void save(Issue issue) {
        items.add(issue);
//         System.out.println("Issue добавлен.");
    }

    public List<Issue> findAll() {
        return items;
    }

    public List<Issue> findByOpen(String open) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.matches(open)) {
                result.add(item);
            }
        }
//        System.out.println("Все ОК Repository.");
        return result;
    }

    public List<Issue> findByClosed(String closed) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.matches(closed)) {
                result.add(item);
            }
        }
//        System.out.println("Все ОК Repository.");
        return result;
    }

    public List<Issue> findByAuthor(String author) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.matchesAuthor(author)) {
                result.add(item);
//                System.out.println("Автор найден.");
            }
        }
        return result;
    }

    public List<Issue> findByLabel(String label) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.matchesLabel(label)) {
                result.add(item);
//                System.out.println("Метка найдена.");
            }
        }
       return result;
    }

    public List<Issue> findByAssignee(String assignee) {
        List<Issue> result = new ArrayList<>();
        for (Issue item : items) {
            if (item.matchesAssignee(assignee)) {
                result.add(item);
//                System.out.println("Назначенный найден.");
            }
        }
        return result;
    }


    public List<Issue> sortAll() {
        Collections.sort(items);
        for (Issue item : items) {
//            System.out.println(item);
        }
        return items;
    }

}
