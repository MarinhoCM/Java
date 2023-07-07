package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(10 , 10);
        System.out.println("---------------------->");
        calculadora.subtrair(10, 5);
        System.out.println("---------------------->");
        calculadora.multiplicar(10, 10);
    }
}
