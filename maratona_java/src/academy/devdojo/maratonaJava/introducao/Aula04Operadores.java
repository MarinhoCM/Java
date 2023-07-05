package academy.devdojo.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // (  +  -  *  / )
        // operações com numeros int sempre retornaram numeros
        // inteiros
        int numero1 = 10;
        double numero3 = 10;
        int numero2 = 20;
        double numero4 = 20;
        int soma = numero2 + numero1;
        System.out.println(numero2 - numero1);
        System.out.println("Valor "+numero2 + numero1);
        System.out.println(numero2 * numero1);
        System.out.println(numero1 / numero2); // 0
        System.out.println(numero3 / numero4); // 0.5
        System.out.println(soma);

        // % = resto
        int resto = 20 % 2;
        System.out.println("resto:");
        System.out.println(resto);

        // Operadores: ( < >  <= >= == != ) return boolleans
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

        // Operadores Lógicos: ( (&&(AND)) (||(or)) (!(not)) ) return boolean
        int idade = 35;
        int outraIdade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = outraIdade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        // (or) = ||
        double valorTotalcontaCorrente = 200;
        double valorTotalcontaPoupanca = 10000;
        double valorPlayStation = 5000;
        boolean isPlayStation5Compravel = (
                valorTotalcontaCorrente > valorTotalcontaPoupanca ||
                valorTotalcontaPoupanca > valorPlayStation
        );
        System.out.println("isPlayStation5Compravel: "+isPlayStation5Compravel);

        // Operadores de atribuição: (
        //   =  +=  -=  *=  /=  %=
        // )
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        System.out.println("bonus: "+bonus); // 2800
        bonus -= 1000;
        System.out.println("bonus: "+bonus); // 1800
        bonus *= 2;
        System.out.println("bonus: "+bonus); // 3600
        bonus /= 2;
        System.out.println("bonus: "+bonus); // 1800
        bonus %= 2;
        System.out.println("bonus: "+bonus); // 0.0

        //
        int contador = 0;
        // contador += 1;
        contador++; // aumenta de um em um
        contador--; // diminui de um em um
        System.out.println("contador: "+contador);
        int contador2 = 0;
        System.out.println(contador2++); // primeiro imprime depois incrementa
        // por isso retorna 0
        System.out.println("contador: "+contador2); // agr retorna 1
        System.out.println(++contador2); // dessa forma primeiro incrementa
        // por isso retorna 1
    }
}
