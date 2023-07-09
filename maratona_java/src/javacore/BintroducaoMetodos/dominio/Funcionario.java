package javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }
    public double mediaDosSalarios(double[] salario){
        double media = 0;
        for (double num: salario) {
            media += num;
        }
        return media / salario.length;
    }
}
