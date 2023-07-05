package academy.devdojo.maratonaJava.introducao;

public class Aula03Exercicio {
    /*Crie variáveis para os campos descritos abaixo entre <>
    * e imprima a seguinte mensagem:
    *   Eu <nome>, morando no endereço <endereco>,
    *   confirmo que recebi o salário de <salario>,
    *   na data <data>.
    **/
    public static void main(String[] args) {
        String nome = "Marin";
        String endereco = "Rua São Cristovão";
        double salario = 2500.8;
        String data = "23/06/2023";
        String mensagem = "Eu "+nome+", morando no endereço"+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".";
        System.out.println(mensagem);
    }
}
