package refactor;

public class Main {

    public static void main(String[] args) {
        DeckFactory DeckFactory = new DeckFactory();
 
        //get an object of redApples and call its createDeckFromFile method.
        Deck redDeck = DeckFactory.getDeck("REDAPPLE");
        redDeck.createDeckFromFile();
 
        //get an object of greenApples and call its createDeckFromFile method.
        Deck greenDeck = DeckFactory.getDeck("GREENAPPLE");
        greenDeck.createDeckFromFile();
    }
 }