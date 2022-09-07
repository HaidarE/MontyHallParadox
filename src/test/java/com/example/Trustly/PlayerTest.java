package com.example.Trustly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void playerSwitchingChoice() {
        var doors = new Doors();
        Player player = new Player();
        assertNotEquals(player.playerChosingDoor(),player.playerSwitchingChoice(doors.getDoors(),player.playerChosingDoor(),doors.getFirstDoor()));
    }
}