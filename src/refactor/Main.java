package refactor;

import java.util.*;

import jdk.nashorn.internal.ir.SetSplitState;
import refactor.players.*;
import refactor.decks.*;
import refactor.factories.*;

public class Main {

    // DeckFactory DeckFactory = new DeckFactory();
 
        // // Get an object of redApples and call createDeckFromFile method to scan the text file.
        // Deck redDeck = DeckFactory.getDeck("REDAPPLE");
        // List redApples = redDeck.createDeckFromFile();
        // // Shuffle the deck.
        // greenDeck.shuffleDeck(redApples);

        // // Get an object of greenApples and call createDeckFromFile method to scan the text file.
        // Deck greenDeck = DeckFactory.getDeck("GREENAPPLE");
        // List greenApples = greenDeck.createDeckFromFile();
        // // Shuffle the deck.
        // greenDeck.shuffleDeck(greenApples);

    public static void main(String[] args) {
        
    List<Role> playerList = new ArrayList<Role>();

    playerList.add(new PlayerRoleDecorator(new Judge()));
    playerList.add(new PlayerRoleDecorator(new Judge()));
    playerList.get(0).canAct();
    playerList.get(0).setRole(true);
    playerList.get(0).canAct();


    // playerList.add(new JudgePlayerDecorator(new HumanPlayer()));
    // playerList.add(new JudgePlayerDecorator(new HumanPlayer()));
    // playerList.add(new JudgePlayerDecorator(new HumanPlayer()));

    // playerList.get(0).setPlayerID("Laxa");
    // playerList.get(1).setPlayerID("Umea");
    // playerList.get(2).setPlayerID("Lulea");

    // playerList.get(0).getPlayerID();

    // System.out.println(playerList.get(0));

    // JudgePlayerDecorator(playerList.get(0));
    // System.out.println(playerList.get(0).getPlayerID());
    // JudgePlayerDecorator(playerList.get(1));
    // System.out.println(playerList.get(0).getPlayerID());

    // for(Role element : playerList) {
    //     element.vote();
    // }

    // list.get(0).setPlayerID("Despacito1");
    // list.get(1).setPlayerID("Henkelwankel");
    // list.get(2).setPlayerID("Jenkins");

    // System.out.println("Person with no roles");
    // System.out.println(list.get(0).getPlayerID());

    // System.out.println("\nPerson of role: Judge.");
    // System.out.println(humanJudge.getTypeOfPlayer());

    // System.out.println("\nBot of role: Judge");
    // botJudge.getTypeOfPlayer();

    // System.out.println("\nHumanJudge is made anew.");
    // humanJudge = new JudgePlayerDecorator(new HumanPlayer());

    // System.out.println("\nPerson of role: Judge.");
    // humanJudge.getTypeOfPlayer();

    }
 }