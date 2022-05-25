package org.vashonsd;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* A single player dungeon-crawler game with enemies, players, rooms, and items. The items can be used by players and dropped by enemies. Rooms can have enemies, items and can be moved through by the player.
        Players can have items, attack and kill enemies, and move through rooms. Enemies can be of different types, drop different weapons when killed, and attack. Both enemies and players have armor classes that determine
        how easily they can be hit. Both enemies and players can have different statistics to hit. A players to hit statistics are determined by the weapon wielded.
        */
        Scanner input=new Scanner(System.in);

        System.out.println("What would you like your name to be?");
        String name=input.next();
        Weapon woodenSword=new Weapon(6, "Wooden sword");

        ArrayList<Item> startingInventory=new ArrayList<>();

        startingInventory.add(woodenSword);

        Player mainPlayer=new Player(startingInventory, name, woodenSword);

        Game game=new Game(mainPlayer);
    }
}
