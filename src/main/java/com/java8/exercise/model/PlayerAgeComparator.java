package com.java8.exercise.model;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
    }

}