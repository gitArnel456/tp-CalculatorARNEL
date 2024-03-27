/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdan008.tp.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inclusive014
 */
public class CalculatorTest {

    @org.junit.Test
    public void additionTest() {
        Calculator add = new Calculator();
        assertEquals(6, add.addition(4, 2));
        assertEquals(7, add.addition(-7, 14));
        assertEquals(12, add.addition(0, 12));
    }

    @org.junit.Test
    public void soustractionTest() {
        Calculator sous = new Calculator();
        assertEquals(1, sous.soustraction(5, 4));
        assertEquals(-7, sous.soustraction(-5, 2));
        assertEquals(4, sous.soustraction(4, 0));
    }

    @org.junit.Test
    public void divisionTest() {
        Calculator div = new Calculator();
        assertEquals(4, div.division(8, 2));
        assertEquals(-4, div.division(-8, 2));
        try {
            assertEquals(0, div.division(10, 0));
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }

    }

    @org.junit.Test
    public void multiplicationTest() {
        Calculator mult = new Calculator();
        assertEquals(6, mult.multiplication(3, 2));
        assertEquals(6, mult.multiplication(-3, -2));
        assertEquals(0, mult.multiplication(17, 0));
    }
}
