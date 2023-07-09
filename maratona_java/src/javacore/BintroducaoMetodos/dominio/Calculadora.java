package javacore.BintroducaoMetodos.dominio;

public class Calculadora {
    public void soma(int num, int num2){

        System.out.println(num + num2);
    }
    public void subtrair(int num, int num2){

        System.out.println(num - num2);
    }
    public void multiplicar(int num, int num2){

        System.out.println(num * num2);
    }
    public void dividir(int num, int num2){
        if (num < 1){
            System.out.println("INSIRA UM VALOR VALIDO!");
        } else if (num2 < 1){
            System.out.println("INSIRA UM VALOR VALIDO!");
        } else {
            System.out.println(num / num2);
        }
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}