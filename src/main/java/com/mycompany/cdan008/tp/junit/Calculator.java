/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cdan008.tp.junit;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut être zéro");

        } else {
            return a / b;
        }
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}
