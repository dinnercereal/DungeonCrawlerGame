package org.vashonsd;

public class HealingItem extends Item{

    int healing;

    public HealingItem(int healing, String name){
        super(name);
        this.healing=healing;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    public void use(Player player){
        player.setCurrentHP(player.getCurrentHP()+healing);
    }

    @Override
    public String toString() {
        return "A healing potion that heals " + healing + " health";
    }
}
