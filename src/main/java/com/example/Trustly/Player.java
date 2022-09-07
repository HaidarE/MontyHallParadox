package com.example.Trustly;

import java.util.Random;

public class Player {
    Random pick = new Random();
    public Player() {
    }

    public int playerChosingDoor (){
        return pick.nextInt(0,3);
    }

    //Looping through door array to find a door to switch and returns the value of the door to the controller class.
    public int playerSwitchingChoice (int[] doors,int choice,int firstDoor) {
        int switchChoice=0;
        for (int i = 0; i < doors.length; i++)
            if (doors[i]!=firstDoor && (doors[i]!=choice))
                switchChoice=doors[i];

        return switchChoice;
    }
}
