
package jogo_advinhacao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author caua_marinho
 */
public class Jogo_advinhacao {

    public static void main(String[] args) {
        System.out.println("Olá! Sou Random.");
        System.out.println("Pensei em um número entre 1 e 100!");
        System.out.println("Acha que consegue advinha-lo?");
        System.out.println("Tente se for capaz!");
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
       
        /*Variáveis*/
        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt(100) + 1;/*Java inicia a contagem apartir do '0' então acrecentamos '+1' para que a contagem inicie apartir de 1;*/
        long palpite = 0;
        
        while(tentativas > 0 &&acertou == false){
            System.out.println("Digite seu palpite: ");
            palpite = input.nextLong();
            if(numeroSecreto == palpite){
                /*Condição Booleana If(Fará com que "se" o usuário acertar o palpite apresente as 
                seguintes mensagens abaixo) */
                System.out.println("Parabéns!!! Você acertou!");
                System.out.println("Você consegui acertar com "+tentativas+" tentativas restantes!");
                acertou = true;
            }else if(palpite < numeroSecreto){
                /*Else if (Apresenta uma dica e quantas tentativas restantes o usuário possui) só ocorre 
                caso if não seja verdadeiro.*/
                --tentativas;
                System.out.println("Número baixo demais! Você possui "+ tentativas + " restantes!");
            }else{
                /*Else(Apresenta uma dica e quantas tentativas restantes o usuário possui mas de
                forma diferente do else if) só ocorrerá quando if e else if forem falsos */
                --tentativas;
                System.out.println("Número alto demais! Você possui "+ tentativas + " restantes!");
            }
        }
    if(tentativas < 1){
        /*Menssagem que será apresentada casó o usuário acabe todas as 10 tentativas*/
        System.out.println("Você perdeu!!! :)");
        System.out.println("Tente novamente!!!");
    }
    }
}