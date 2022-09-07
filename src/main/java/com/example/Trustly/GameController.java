package com.example.Trustly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
Player player = new Player();
@GetMapping()
String Start(Model model){

    //Declaring variables.
    Doors door = new Doors();
    Player player = new Player();

    int [] doors = door.getDoors();

    int winCountStaying=0;
    int winCountSwitching=0;
    int loopCounter=0;

    do {
        //Choosing winning door.
        int winningDoor = door.getWinningDoor();

        //Choosing players door.
        int choice=player.playerChosingDoor();

        //Host opening the first door.
        int firstDoor = door.openFirstDoor(winningDoor,choice);

        //Player switching doors.
        int switchChoice= player.playerSwitchingChoice(doors,choice,firstDoor);

        //Counts winnings when staying on the same door.
        if (choice==winningDoor){
            winCountStaying++;}

        //Counts winnings when switching doors.
        if (switchChoice==winningDoor){
            winCountSwitching++;}

        loopCounter++;
    }
    while (loopCounter<100);

    model.addAttribute("Staying",winCountStaying);
    model.addAttribute("Switching",winCountSwitching);

    return "View";
}
}
