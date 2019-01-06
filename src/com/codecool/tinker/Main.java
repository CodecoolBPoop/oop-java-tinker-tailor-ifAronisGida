package com.codecool.tinker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Number of players: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();
        System.out.println("Number of syllables: ");
        int numberOfSyllables = scanner.nextInt();
        scanner.close();
        System.out.println("numberOfPlayers: " + numberOfPlayers);
        System.out.println("numberOfSyllables: " + numberOfSyllables);

        //creates array and fills it with numbers as players
        ArrayList<Integer> players = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(i+1);
        }

        Iterator<Integer> iterator = players.iterator();

        int counter = 0;
        while (players.size() > 1) {
            if (!iterator.hasNext()) iterator = players.iterator(); //if we reach the end we reset the iterator to the beginning
            iterator.next();
            counter++;
            if (counter == numberOfSyllables) {
                iterator.remove();
                counter = 0;
            }
        }

        System.out.println("The winner is: " + players.get(0));

    }
}
