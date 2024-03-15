package com.java8.exercise.classes;

import com.java8.exercise.model.Player;
import com.java8.exercise.model.PlayerAgeComparator;
import com.java8.exercise.model.PlayerRankingComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

        PlayerAgeComparator playerComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam,playerComparator);
        System.out.println("After Sorting : " + footballTeam);


        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);

        numbers.stream().sorted((a, b) -> a.compareTo(b));

        numbers.stream().sorted(Integer::compareTo);

        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");


    }

}
