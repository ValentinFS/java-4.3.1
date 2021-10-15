package ru.netology.domain;


import ru.netology.manager.Manager;
import ru.netology.repository.Repository;

public class Main {
    public static void main(String[] args) {

        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Issue issue1 = new Issue(1, "Issue1", "Open", "Иванов", "label1", "Project1", "Milestone1", "Петров", "Sort1", 234);
        Issue issue2 = new Issue(2, "Issue2", "Closed", "Петров", "label2", "Project2", "Milestone2", "Сидоров", "Sort2", 743);
        Issue issue3 = new Issue(3, "Issue3", "Open", "Кураев", "label3", "Project3", "Milestone3", "Петров", "Sort3", 231);
        Issue issue4 = new Issue(4, "Issue4", "Open", "Алексеев", "label4", "Project4", "Milestone4", "Кураев", "Sort4", 385);
        Issue issue5 = new Issue(5, "Issue5", "Closed", "Петров", "label5", "Project5", "Milestone5", "Сидоров", "Sort5", 935);
        Issue issue6 = new Issue(6, "Issue6", "Open", "Иванов", "label6", "Project6", "Milestone6", "Петров", "Sort6", 654);
        Issue issue7 = new Issue(7, "Issue7", "Closed", "Алексеев", "label7", "Project7", "Milestone7", "Кураев", "Sort7", 322);
        Issue issue8 = new Issue(8, "Issue8", "Open", "Петров", "label8", "Project8", "Milestone8", "Алексеев", "Sort8", 412);

        manager.addIssue(issue1);
        manager.addIssue(issue2);
        manager.addIssue(issue3);
        manager.addIssue(issue4);
        manager.addIssue(issue5);
        manager.addIssue(issue6);
        manager.addIssue(issue7);
        manager.addIssue(issue8);
        manager.searchByOpen("Open");
        manager.searchByClosed("Closed");
        manager.searchByAuthor("Иванов");
        manager.searchByLabel("Label7");
        manager.searchByAssignee("Label7");
        manager.getAll();
        manager.sortManagerAll();
        manager.changeManagerStatus(6);

//         System.out.println(manager.searchByOpen("Open"));
//         System.out.println(manager.searchByOpen("Closed"));
//         System.out.println(manager.searchByAuthor("Петров"));
//         System.out.println(manager.searchByLabel("label7"));
//         System.out.println(manager.searchByAssignee("Кураев"));

    }
}
