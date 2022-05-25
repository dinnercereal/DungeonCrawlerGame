package org.vashonsd;

import java.util.ArrayList;

public class Room {

    //Description of the room
    String description;
    //The enemy within the room
    Enemy enemy;
    //The loot that may be within the room, regardless fo loot dropped by the enemy.
    ArrayList<Item> loot;

    public Room(String description, Enemy enemy, ArrayList<Item> loot) {
        this.description = description;
        this.enemy = enemy;
        this.loot = loot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    public void setLoot(ArrayList<Item> loot) {
        this.loot = loot;
    }
}
