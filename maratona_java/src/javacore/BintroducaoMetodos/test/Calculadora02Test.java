package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class Calculadora02Test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(10, 10);
        calculadora.subtrair(10, 9);
        calculadora.multiplicar(10, 10);
        calculadora.dividir(10, 5);
    }
}
