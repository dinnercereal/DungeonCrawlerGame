package org.vashonsd;

import java.util.ArrayList;

public class Enemy {
    //The loot the enemy drops when killed
    public ArrayList<Item> loot;
    public int currentHP, maxHP;
    //The damage an enemy does
    public int damage;
    //Is false if the enemy is alive, true if the enemy is dead
    public boolean isDead;

    public Enemy(ArrayList<Item> loot, int currentHP, int maxHP){
        this.loot = loot;
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        isDead=false;
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    public void setLoot(ArrayList<Item> inventory) {
        this.loot = inventory;
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

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Player player){
        int damageDealt=0;
        damageDealt+=getDamage();
        damageDealt-=player.getEquippedShield().getBlock();
        if(damageDealt<0){
            damageDealt=0;
        }
        player.setCurrentHP(player.getCurrentHP()-damageDealt);
    }
}
