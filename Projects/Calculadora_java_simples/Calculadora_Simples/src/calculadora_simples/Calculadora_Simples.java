
package calculadora_simples;

import java.util.Scanner;
public class Calculadora_Simples {
    
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_GREEN = "\u001B[32m";

        double number, number_two;
        int op;
        double sum, sub, mul, div;
        Scanner in = new Scanner(System.in);
        System.out.print(ANSI_GREEN+"Informe o primeiro valor: "+ANSI_RESET);
        number = in.nextDouble();
        System.out.print(ANSI_GREEN+"Informe o segundo valor: "+ANSI_RESET);
        number_two = in.nextDouble();
        System.out.println(ANSI_YELLOW+"######SELECIONE UMA OPERACAO######");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println(">>>>>>>>>>>>>>>>>>>>Digite sua opção:"+ANSI_RESET);
        op = in.nextInt();
        switch(op){ 
            case 1:
                if (number < 0 || number_two < 0){
                    System.out.print(
                        ANSI_RED+"Informe um número positivo"+ANSI_RED
                    );
                    break;
                } else {
                    sum = number+number_two;
                    System.out.print(
                        ANSI_GREEN+"A sua soma e igual a:"+ANSI_RESET+" "+sum
                    );
                    break;
                }
            case 2:
                sub = number-number_two;
                System.out.print(
                    ANSI_GREEN+"A sua subtração e igual a:"+ANSI_RESET+" "+sub
                );
                break;
            case 3:
                mul = number*number_two;
                System.out.print(
                    ANSI_GREEN+"A sua multiplicação e igual a:"+ANSI_RESET+" "+mul
                );
                break;
            case 4:
                if (number == 0 || number_two == 0){
                    System.out.print(
                        ANSI_RED+"ZeroDivisionError"+ANSI_RESET
                    );
                    break;
                }    
                if(number<number_two){
                    System.out.print(
                        ANSI_RED+"Impossivel de realizar o calculo"+ANSI_RESET
                    );
                }
                else{
                    div = number/number_two;
                    System.out.print(
                        ANSI_GREEN+"A sua divisão e igual a:"+ANSI_RESET+" "+div
                    );
                }
                break;                     
            default:   
                System.out.println(ANSI_RED+"Operação invalida!!!"+ANSI_RESET);       
        }
    }
}
