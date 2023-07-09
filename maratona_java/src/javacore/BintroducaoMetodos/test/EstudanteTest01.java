package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Estudante;
import javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "nome";
        estudante.idade = 15;
        estudante.sexo = 'M';

        estudante02.nome = "test";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante);
        impressora.imprime(estudante02);
    }
}
