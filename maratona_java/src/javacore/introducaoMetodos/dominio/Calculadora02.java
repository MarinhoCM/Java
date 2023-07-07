package javacore.introducaoMetodos.dominio;

public class Calculadora02 {
    public double soma(double num, double other_num){
        return num + other_num;
    }
    public double subtrair(double num, double other_num) {
        return num - other_num;
    }
    public double multiplicar(double num, double other_num){
        return num * other_num;
    }
    public double dividir(double num, double other_num){
        if (num < 1){
            System.out.println("INSIRA UM NUMERO VALIDO!");
        } else if (other_num < 1){
            System.out.println("INSIRA UM NUMERO VALIDO!");
        } else {
            return num / other_num;
        }
        return 0.0;
    }
}
