package com.example;

import java.util.Scanner;

public class App 
{
    public static Npc npc = new Npc();
    public static boolean round_ended = false;
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        while (!round_ended) {
            System.out.println("insert: 'rock', 'paper', scissors'");
            String user_choice = inp.nextLine();
            String npc_choise = npc.getChoice();
            if (user_choice.equals(npc_choise)) { // npc and user are equal
                System.out.println("no winner, retry");
            } else if (user_choice.equals("rock") && npc_choise.equals("paper")) { // rock - paper
                round_ended = true;
                System.out.println("npc won (npc: "+npc_choise+")");
            } else if (user_choice.equals("paper") && npc_choise.equals("rock")) { // paper - rock
                round_ended = true;
                System.out.println("user won (npc: "+npc_choise+")");
            } else if (user_choice.equals("scissors") && npc_choise.equals("rock")) { // scissors - rock
                round_ended = true;
                System.out.println("npc won (npc: "+npc_choise+")");
            } else if (user_choice.equals("rock") && npc_choise.equals("scissors")) { // rock - scissors
                round_ended = true;
                System.out.println("user won (npc: "+npc_choise+")");
            } else if (user_choice.equals("paper") && npc_choise.equals("scissors")) { // paper - scissors
                round_ended = true;
                System.out.println("npc won (npc: "+npc_choise+")");
            } else if (user_choice.equals("scissors") && npc_choise.equals("paper")) { // scissors - paper
                round_ended = true;
                System.out.println("user won (npc: "+npc_choise+")");
            }
        }
    }
}
