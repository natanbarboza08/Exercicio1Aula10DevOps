package com.senai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcIMCTest {
    
    @Test
    public void testarIMC () {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(70.00, 1.75);
        assertEquals(22.85, resultado, 0.01);
    }

}