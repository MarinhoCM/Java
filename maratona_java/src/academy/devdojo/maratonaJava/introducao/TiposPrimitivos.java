package academy.devdojo.maratonaJava.introducao;

import java.util.Arrays;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        /*
        * para criar variáveis em java precisamos
        * informar o tipo dela e depois passar o
        * nome da variável:
        *   int numero;
        *   char name;
        * */
        int age = (int) 100000000000000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean True = true;
        boolean False = false;
        long numeroGrande = 100000000;
        char caractere = 'M';// para numeros utilize unicode
        String texto = "test";
        /* ou numeros de ASK */
        System.out.println("age = " + age);
        System.out.println(True);
        System.out.println(False);
        System.out.println(texto);
    }
}
