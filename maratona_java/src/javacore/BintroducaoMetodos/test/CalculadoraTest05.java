package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {
                1,3,4,5,6
        };
        System.out.println("forEach: ---------------->");
        calculadora.somaArray(numeros);
        System.out.println("VarArgs: ---------------->");
        calculadora.somaVarArgs(numeros);
        System.out.println("outra forma: ------------>");
        calculadora.somaVarArgs(1,3,4,5,6);
    }
}
