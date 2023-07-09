package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

    }
    public void alteraDoisNumeros(int num, int otherNum){
        Calculadora calculadora = new Calculadora();
        num = 99;
        otherNum = 33;
        System.out.println("Dentro de alteraDoisNumeros");
        System.out.println("num" +num);
        System.out.println("otherNum" +otherNum);
        calculadora.soma(num, otherNum);

    }
}
