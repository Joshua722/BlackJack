package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        String userChoice;
        String player1 = "";
        String player2 = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.println("""
                Welcome to BlackJack!
                Please choose one of the following!
                1)Player 1 Name
                2)Player 2 Name
                3)Exit
                """);
        userChoice = myScanner.nextLine();

        switch (userChoice) {
            case "1":
                System.out.println("Please enter your name : ");
                player1 = myScanner.nextLine().trim();
                break;
            case "2":
                System.out.println("Please enter your name : ");
                player2 = myScanner.nextLine().trim();
                break;
            case "3":
                System.exit(0);
            default:
                System.out.println("Please choose a valid input.");
                break;
        }
        if (player2.isEmpty()) {
            player2 = "John Cena";
        }
        if (player1.isEmpty()) {
            player1 = "The Chosen One";
        }

        //player 1 deck
        for (int i = 0; i < 3; i++) {
            Card card = deck.deal();
            deck.shuffle();
            hand1.deal(card);

        }

        //player 2 deck
        for (int i = 0; i < 3; i++) {
            Card card = deck.deal();
            deck.shuffle();
            hand2.deal(card);

        }
        //int totalHandValue = deck.
        int handValue1 = hand1.getValue();
        int handValue2 = hand2.getValue();
        if (handValue2 > handValue1 && handValue2 <= 21) {
            System.out.println("The winner is " + player2 + "! " + "Here is the value of your hand " + handValue2 + " " + hand2.getSize());
        } else if(handValue2 < handValue1 && handValue1 <= 21) {
            System.out.println("The winner is " + player1 + "! " + "Here is the value of your hand " + handValue1+ " " + hand1.getSize());
        } else{
            System.out.println("It's a draw");
        }

    }
}
