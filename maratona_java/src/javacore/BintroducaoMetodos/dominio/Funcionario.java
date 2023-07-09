package javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: this.salarios) {
            System.out.println(salario+ " ");
        }
    }
    public void mediaDosSalarios(){
        double media = 0;
        for(double salario: this.salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial "+ media);
    }
}
