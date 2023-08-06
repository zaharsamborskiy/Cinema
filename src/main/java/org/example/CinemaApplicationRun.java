package org.example;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Spider-Man", "Fantastic", 2);
        Cinema cinema2 = new Cinema("Harry Potter", "Fantastic", 2.5);
        Cinema cinema3 = new Cinema("Saw", "Horror", 2.1);
        Cinema cinema4 = new Cinema("The wolf of wall street", "Drama/Crime", 2);
        Cinema cinema5 = new Cinema("Hitman", "Action", 3);
        Cinema cinema6 = new Cinema("Hobbit", "Fantastic", 3.5);
        List<Cinema> list1 = new ArrayList<>();
        list1.add(cinema1);
        list1.add(cinema2);
        List<Cinema> list2 = new ArrayList<>();
        list2.add(cinema3);
        list2.add(cinema4);
        List<Cinema> list3 = new ArrayList<>();
        list3.add(cinema5);
        list3.add(cinema6);


        Viewer viewer1 = new Viewer("Bob",25,list1);
        Viewer viewer2 = new Viewer("Tom",18, list3);
        Viewer viewer3 = new Viewer("Jack",19, list2);
        Viewer viewer4 = new Viewer("Alice",14, list3);
        Viewer viewer5 = new Viewer("Mary",19,list1);
        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(viewer1);
        viewerList.add(viewer2);
        viewerList.add(viewer3);
        viewerList.add(viewer4);
        viewerList.add(viewer5);
        double avg = ViewerStatistics.averageAge(viewerList);
        System.out.println(avg);
        System.out.println(viewer1.getCinemaList());
    }
}
