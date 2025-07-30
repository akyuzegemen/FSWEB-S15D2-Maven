package org.example.entity;

import java.util.*;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name)
    {
        switch (name) {
            case "ann":
                return this.annsTasks;

            case "bob":
                return this.bobsTasks;

            case "carol":
                return this.carolsTasks;

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
