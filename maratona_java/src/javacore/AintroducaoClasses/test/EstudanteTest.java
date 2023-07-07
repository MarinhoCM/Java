package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "marin";
        estudante.idade = 19;
        estudante.sexo = 'H';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
