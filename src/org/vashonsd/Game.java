package org.vashonsd;

import java.util.ArrayList;
import java.util.Random;


public class Game {
    public Player player;
    public ArrayList<Room> rooms;
    public Random rand;

    public Game(Player player){
        this.player=player;
        rooms=new ArrayList<>();
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void run(){
        Room currentRoom=rooms.get(rand.nextInt(rooms.size()-1));
        System.out.println("You find yourself in a room that is " + currentRoom.getDescription() + ".");
    }
}
