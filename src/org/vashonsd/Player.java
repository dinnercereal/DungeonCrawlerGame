package org.vashonsd;

import java.util.ArrayList;

public class Player {

    public ArrayList<Item> inventory;
    public String name;
    public int currentHP, maxHP;
    public Weapon equippedWeapon;
    public Shield equippedShield;
    public boolean isDead;

    public Player(ArrayList<Item> inventory, String name, Weapon equippedWeapon){
        this.inventory = inventory;
        this.name = name;
        currentHP = 100;
        maxHP = 100;
        this.equippedWeapon=equippedWeapon;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Shield getEquippedShield() {
        return equippedShield;
    }

    public void setEquippedShield(Shield equippedShield) {
        this.equippedShield = equippedShield;
    }

    //Attacks the given enemy
    public void attack(Enemy enemy){
        enemy.setCurrentHP(enemy.getCurrentHP()-equippedWeapon.getDamage());
    }

    //Prints out the player inventory
    public String viewInventory(){
        String str = getName() + "'s inventory:\n";
        for(Item i:inventory){
            str+= i.toString() + "\n";
        }
        return str;
    }
}
