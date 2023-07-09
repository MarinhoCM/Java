package javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: this.salarios) {
            System.out.println(salario+ " ");
        }
    }
    public void mediaDosSalarios(){
        if (salarios != null) {
            for (double salario : this.salarios) {
                media += salario;
            }
        }
        media /= salarios.length;
        System.out.println("Media salarial "+ media);
    }
}
