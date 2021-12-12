package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Issue;
import ru.netology.manager.Manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Issue issue1 = new Issue(1, "Issue1", "Open", "Иванов", "component, status", "Project1", "Milestone1", "Петров", "Sort1", 234);
    Issue issue2 = new Issue(2, "Issue2", "Closed", "Петров", "label2", "Project2", "Milestone2", "Сидоров", "Sort2", 743);
    Issue issue3 = new Issue(3, "Issue3", "Open", "Кураев", "label3", "Project3", "Milestone3", "Петров", "Sort3", 231);

    @BeforeEach
        public void setUp() {
        manager.addIssue(issue1);
        manager.addIssue(issue2);
        manager.addIssue(issue3);
    }

    @Test
    void shouldSaveItem() {
        List<Issue> expected = new ArrayList<>(List.of(issue1, issue2, issue3));
        List<Issue> actual = manager.getAll();
        assertEquals(expected, actual);

    }

    @Test
    void shouldFindAll() {
        List<Issue> expected = new ArrayList<>(List.of(issue1, issue2, issue3));
        List<Issue> actual = manager.getAll();
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByOpen() {
        List<Issue> expected = new ArrayList<>(List.of(issue1, issue3));
        List<Issue> actual = manager.searchByOpen("Open");
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByClosed() {
        List<Issue> expected = new ArrayList<>(List.of(issue2));
        List<Issue> actual = manager.searchByClosed("Closed");
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByAuthor() {
        List<Issue> expected = new ArrayList<>(List.of(issue2));
        List<Issue> actual = manager.searchByAuthor("Петров");
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByLabel() {
        Set<Issue> expected = new HashSet<>(Set.of(issue3));
        Set<Issue> actual = manager.searchByLabel("label3");
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByAssignee() {
        Set<Issue> expected = new HashSet<>(Set.of(issue2));
        Set<Issue> actual = manager.searchByAssignee("Сидоров");
        assertEquals(expected, actual);
    }

    @Test
    void shouldSortAll() {
        List<Issue> expected = new ArrayList<>(List.of(issue1, issue2, issue3));
        List<Issue> actual = manager.sortManagerAll();
        assertEquals(expected, actual);
    }
}