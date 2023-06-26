
package produto;
//@author caua_marinho

import java.util.Scanner;

public class CalculaMargemLucro{
    
    public static void main(String[] args){
        String nome;
        double precoCusto, precoVenda, lucro, margemLucro;
        
        Scanner p = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        nome = p.next();
        System.out.println("precoCusto: ");
        precoCusto = p.nextDouble();
        System.out.println("precoVenda: ");
        precoVenda = p.nextDouble();
        lucro = precoVenda - precoCusto;
        if(precoVenda < precoCusto){
            System.out.println("Impossivel comprar este produto, quantia de dinheiro insuficiente!");
        }
        if(lucro <= 0){
            System.out.println("Você não irá lucrar com essa venda!");
        }else{
            System.out.println("Lucro: "+lucro);
            margemLucro = (lucro / 100);
            System.out.println("Percentual Margem de Lucro: "+margemLucro);
        }
        
    }   
}
