package refactor;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        DeckFactory DeckFactory = new DeckFactory();
 
        // Get an object of redApples and call createDeckFromFile method to scan the text file.
        Deck redDeck = DeckFactory.getDeck("REDAPPLE");
        List redApples = redDeck.createDeckFromFile();
        // Shuffle the deck.
        greenDeck.shuffleDeck(redApples);

        // Get an object of greenApples and call createDeckFromFile method to scan the text file.
        Deck greenDeck = DeckFactory.getDeck("GREENAPPLE");
        List greenApples = greenDeck.createDeckFromFile();
        // Shuffle the deck.
        greenDeck.shuffleDeck(greenApples);
    }
 }