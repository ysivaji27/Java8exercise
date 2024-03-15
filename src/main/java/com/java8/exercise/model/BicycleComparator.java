package com.java8.exercise.model;

import java.util.Comparator;

public class BicycleComparator implements Comparator<Bicycle> {

    public int compare(Bicycle a, Bicycle b) {
        return a.getFrameSize().compareTo(b.getFrameSize());
    }

}