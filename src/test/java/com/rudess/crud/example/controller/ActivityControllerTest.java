package com.rudess.crud.example.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActivityControllerTest {

    @Test
    void testingMethod() {
        ActivityController controllerTest = new ActivityController();
        String response = controllerTest.testController("testText");
        assertEquals("test done successfully for testText", response);

    }
}