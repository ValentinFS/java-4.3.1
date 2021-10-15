package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue implements Comparable<Issue> {
    private int id;
    private String name;
    private String status;
    private String author;
    private String label;
    private String projects;
    private String milestones;
    private String assignee;
    private String sort;
    private int time;


    @Override
    public int compareTo(Issue o) {
//        return this.id - o.id;
//        return this.time - o.time;
        return this.status.compareTo(o.status);
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", author='" + author + '\'' +
                ", label='" + label + '\'' +
                ", projects='" + projects + '\'' +
                ", milestones='" + milestones + '\'' +
                ", assignee='" + assignee + '\'' +
                ", sort='" + sort + '\'' +
                ", time=" + time +
                '}';
    }

    public boolean matches(String status) {
        if (this.status.contains(status)) {
            return true;
        }
        return false;
    }

    public boolean matchesAuthor(String author) {
        if (this.author.contains(author)) {
            return true;
        }
        return false;
    }

    public boolean matchesLabel(String label) {
        if (this.label.contains(label)) {
            return true;
        }
        return false;
    }

    public boolean matchesAssignee(String assignee) {
        if (this.assignee.contains(assignee)) {
            return true;
        }
        return false;
    }


    public boolean check(int id) {
        if (this.id == id) {
            if(status.contains("Open")){
                status="Closed";
            } else {
                status="Open";
            }
        }
        return true;
    }


}
