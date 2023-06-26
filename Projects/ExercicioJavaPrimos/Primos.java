
package primos;
// @author caua_marinho

import java.util.ArrayList;
import java.util.Scanner;

public class Primos {
   
    private static ArrayList <Integer> arrayList;
        
    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        int iinicial,ifinal, i, j;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Primeiro número: ");
        iinicial = sc.nextInt();
        System.out.println("Digite o último número: ");
        ifinal = sc.nextInt();
        
        boolean primo;
        
        for(i = iinicial; i <= ifinal; i++){
            primo = true;
            if(i == 1)
                primo = false; //se o número for igual a 1 logo ele não é primo.
            
            if(primo){
                if((i%2 == 0) && (i != 2)){
                    primo = false;//numeros divisiveis de 2 que restam 0 
                }                 //  não são primos, exceto o própio 2.
            }
            if(primo){
                for(j = 3; j<= (i/2);j++){//se 'i' for divisivel por número abaixo de 2 'i' não sera primo.
                    if(i%j == 0){         //'se o resto de 'j' for igual á 0.
                        primo = false;    // 'j' não sera primo.
                        break;
                    }
                }
            }
            if(primo)
                arrayList.add(i);
        }
        System.out.println(arrayList.toString());
        System.out.println(String.format("Há %d números primos entre %d e %d",arrayList.size(),iinicial,ifinal));
       
        if(iinicial > ifinal){//mensagem de erro caso o primeiro número seja menor que o segundo.
            System.out.println("Impossivel fazer essa operação!");
            System.out.println("O primeiro número deve ser menor que o Segundo!");
        }
    }    
}        




