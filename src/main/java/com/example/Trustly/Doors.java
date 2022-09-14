package com.example.Trustly;

import java.util.Random;
public class Doors {
    final private int [] doors = {0,1,2};

    private int firstDoor;

    public void setFirstDoor(int firstDoor) {
        this.firstDoor = firstDoor;
    }

    public int getFirstDoor() {
        return firstDoor;
    }

    Random pick = new Random();

    public Doors() {
    }

    public int[] getDoors() {
        return doors;
    }

    public int getWinningDoor() {
        return pick.nextInt(0, 3);
    }

    //Looping through door array to find a door to open and returns the value of the door to the controller class.
    public int openFirstDoor(int winningdoor,int choice ) {
        int firstDoor=1;
        for (int i = 0; i < doors.length; i++)
            if (doors[i] != winningdoor && (doors[i]!=choice)){
                firstDoor = doors[i];
                break;}

        return firstDoor;
    }

}
