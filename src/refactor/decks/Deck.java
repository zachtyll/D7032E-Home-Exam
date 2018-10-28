package refactor.decks;

import java.util.List;
import java.util.ArrayList;

public interface Deck {
    List createDeckFromFile();
    List shuffleDeck(List deck);
 }