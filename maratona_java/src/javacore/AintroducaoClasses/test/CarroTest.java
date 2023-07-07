package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carroSedan = new Carro();
        carroSedan.nome = "Honda";
        carroSedan.modelo = "Civic";
        carroSedan.ano = 2022;

        Carro carro4x4 = new Carro();
        carro4x4.nome = "Ford";
        carro4x4.modelo = "Troller";
        carro4x4.ano = 2020;

        System.out.println("Carro01 ---->");
        System.out.println(carroSedan.nome);
        System.out.println(carroSedan.modelo);
        System.out.println(carroSedan.ano);
        System.out.println("--------------------------->");
        System.out.println("Carro02 ---->");
        System.out.println(carro4x4.nome);
        System.out.println(carro4x4.modelo);
        System.out.println(carro4x4.ano);
        System.out.println("-------------------------------->");
        System.out.println("Carro01 = Carro02");
        carroSedan = carro4x4;
        System.out.println("Carro01 ---->");
        System.out.println(carroSedan.nome);
        System.out.println(carroSedan.modelo);
        System.out.println(carroSedan.ano);
        System.out.println("--------------------------->");
        System.out.println("Carro02 ---->");
        System.out.println(carro4x4.nome);
        System.out.println(carro4x4.modelo);
        System.out.println(carro4x4.ano);
    }
}
