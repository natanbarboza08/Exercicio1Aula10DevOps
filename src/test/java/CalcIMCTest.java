package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcIMCTest {
    
    @Test
    public void testarIMC() {
        CalcIMC calc = new CalcIMC();
        double resultado = calc.calcularIMC(70.00, 1.75);
        
        // No JUnit 5, o delta opcional pode ser passado no final se necessário
        assertEquals(22.85, resultado, 0.01); 
    }
}
