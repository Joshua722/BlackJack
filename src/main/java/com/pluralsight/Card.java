package com.pluralsight;

public class Card {
    private String suit, value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return null;
        }
    }

    public int getValue() {
        if (isFaceUp) {
            //Card values : A,K,Q,J,10,9,8,7,6,5,4,3,2
            if(value.equalsIgnoreCase("A")){
                return 11;
            }
            if(value.equalsIgnoreCase("K") || value.equalsIgnoreCase("Q") || value.equalsIgnoreCase("J")){
                return 10;
            }
            return Integer.parseInt(value);
        } else {
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        if (isFaceUp) {
            return this.getValue();
        } else {
            return 0;
        }
    }

    public void flip() {
       isFaceUp = !isFaceUp;
    }


}
