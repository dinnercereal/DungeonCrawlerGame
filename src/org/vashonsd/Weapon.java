package org.vashonsd;

public class Weapon extends Item{

    int damage;
    double toHit;

    public Weapon(int damage, String name){
        super(name);
        this.damage=damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getToHit() {
        return toHit;
    }

    public void setToHit(double toHit) {
        this.toHit = toHit;
    }

    @Override
    public String toString() {
        return "A sword that deals " + damage + " damage";
    }
}
