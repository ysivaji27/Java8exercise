package com.java8.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player  implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    // constructor, getters, setters

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(getRanking(), otherPlayer.getRanking());
    }
}