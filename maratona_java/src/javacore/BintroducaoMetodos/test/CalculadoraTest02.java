package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicar(10, 10);
        calculadora.dividir(10, 10);
    }
}
