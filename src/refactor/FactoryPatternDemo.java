package refactor;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        DeckFactory DeckFactory = new DeckFactory();
 
        //get an object of "REDAPPLE" and call its createDeckFromFile method.
        Deck redDeck = DeckFactory.getDeck("REDAPPLE");
        redDeck.createDeckFromFile();
 
        //get an object of Square and call its createDeckFromFile method.
        Deck greenDeck = DeckFactory.getDeck("GREENAPPLE");
        greenDeck.createDeckFromFile();
    }
 }