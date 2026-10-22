package com.senai;

public class CalcIMC {

    private double peso;
    private double altura;
    private double resultado;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public CalcIMC () {}

    public double calcularIMC(double peso, double altura) {
        setResultado(peso / (altura * altura));
        return this.resultado;
    }
}