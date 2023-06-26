
package calculadora_simples;

import java.util.Scanner;
public class Calculadora_Simples {

    
    public static void main(String[] args) {
        double n1, n2;
        int op;
        double soma, subtracao, multiplicacao, divisao;
        Scanner entrada = new Scanner(System.in);
        
         System.out.println("Informe o primeiro valor:");
         n1 = entrada.nextDouble();
         System.out.println("Informe o segundo valor:");
         n2 = entrada.nextDouble();
        
         System.out.println("######SELECIONE UMA OPERAÇÃO######");
         System.out.println("[1] - SOMAR");
         System.out.println("[2] - SUBTRAIR");
         System.out.println("[3] - MULTIPLICAR");
         System.out.println("[4] - DIVIDIR");
         System.out.println(">>>>>>>>>>>>>>>>>>>>Digite sua opção:");
         op = entrada.nextInt();
        
        switch(op){ 
            case 1:
                soma = n1+n2;
                System.out.println("A sua soma é igual á:"+soma);
                break;
            case 2:
                subtracao = n1-n2;
                System.out.println("A sua subtração é igual á:"+subtracao);
                break;
            case 3:
                multiplicacao = n1*n2;
                System.out.println("A sua multiplicação é igual á:"+multiplicacao);
                break;
            case 4:
                if(n1<n2){
                    System.out.println("Impossivel de realizar o calculo");
                }
                else{
                    divisao = n1/n2;
                    System.out.println("A sua divisão é igual á:"+divisao);
                }
                break;                     
            
            default:   
                System.out.println("Operação invalida!!!");       
        }
    }
}
