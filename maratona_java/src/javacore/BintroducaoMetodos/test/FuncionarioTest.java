package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "test";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{
                1200, 987.32, 4000
        };
        funcionario.imprime();
        funcionario.mediaDosSalarios();
    }
}
