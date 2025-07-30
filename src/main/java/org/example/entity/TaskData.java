package org.example.entity;

import java.util.*;

public class TaskData {
    private Set<Task> anssTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> anssTasks, Set<Task> bobsTasks, Set<Task> carolTasks, Set<Task> unassignedTasks) {
        this.anssTasks = anssTasks;
        this.bobsTasks = bobsTasks;
        this.carolTasks = carolTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name)
    {
        switch (name) {
            case "ann":
                return this.anssTasks;

            case "bob":
                return this.bobsTasks;

            case "carol":
                return this.carolTasks;

            case "all":
                return this.unassignedTasks; // burasi tam tarif edilmemis
        }
        return null;
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2)
    {
        Set <Task> all = new HashSet<>(set1);
        all.addAll(set2);
        return all;

    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2)
    {
        Set<Task> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2)
    {
        Set<Task> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        return diff;
    }



}
