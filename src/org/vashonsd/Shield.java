package org.vashonsd;

public class Shield extends Item{

    int block;

    public Shield(int block, String name){
        super(name);
        this.block=block;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "A shield that blocks " + block + " damage";
    }
}
