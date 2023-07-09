package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*
        pessoa.nome = "Jiraya";
        pessoa.idade = 70;
        */
        pessoa.setNome("Jiraya");
        pessoa.setIdade(19);
        pessoa.imprime();
    }
}
