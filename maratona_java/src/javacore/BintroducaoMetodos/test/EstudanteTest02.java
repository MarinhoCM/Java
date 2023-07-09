package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Estudante;
import javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Estudante";
        estudante.idade = 18;
        estudante.sexo = 'M';
        estudante.imprime();

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Estudante02";
        estudante02.idade = 17;
        estudante02.sexo = 'F';
        estudante02.imprime();
    }
}
