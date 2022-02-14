package com.example;

import java.util.Random;

public class Npc {
    Random rng = new Random();
    String[] options = {"rock", "paper", "scissors"};

    public String getChoice() {
        int choice = rng.nextInt(options.length);
        return options[choice].toString();
    }
}
