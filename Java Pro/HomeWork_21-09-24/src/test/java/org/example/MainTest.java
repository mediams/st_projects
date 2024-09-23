package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(Main.sum(3, 2), 5, "Error in sum!");
    }
}