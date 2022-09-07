package com.example.Trustly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorsTest {

    @Test
    void openFirstDoor() {
        var doors = new Doors();
        Player player = new Player();
        assertNotEquals(player.playerChosingDoor(),
                doors.openFirstDoor(doors.getWinningDoor(),player.playerChosingDoor()));
    }
}