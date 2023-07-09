package javacore.BintroducaoMetodos.test;

import javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("test");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{
                1200, 987.32, 4000
        });
        funcionario.imprime();
        funcionario.mediaDosSalarios();
    }
}
