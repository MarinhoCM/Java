

// @author caua_marinho
package populacaobaratas;
public class PopulacaoBaratas{
    private int PopulaçãoInicial, PopulacaoTotal;
     
    public PopulacaoBaratas(int PopulaçãoInicial){
        this.PopulaçãoInicial = PopulaçãoInicial;
    }
    public void baratas(int PopulaçãoInicial){
        PopulacaoTotal = PopulaçãoInicial;
    }
    public void dobrarPopulacao(){
        PopulacaoTotal = (PopulaçãoInicial * 2);
    }
    public void sprayVeneno(){
       PopulacaoTotal -= PopulacaoTotal * 10/100;        
    }
    public void obterBaratas(){
        System.out.println("O total de baratas atualmente é: "+PopulacaoTotal);
    } 
    public static void main(String[] args) {
        System.out.println("Cozinha...");
        PopulacaoBaratas populacao = new PopulacaoBaratas(10);
        populacao.dobrarPopulacao();
        System.out.println("A população de baratas em sua cozinha dobrou!");
        populacao.obterBaratas();
        System.out.println("Usando inseticida para matar baratas!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        //novamente
        System.out.println("Usando inseticida novamente!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        //Ultima vez
        System.out.println("Usando inseticida mais uma vez!");
        populacao.sprayVeneno();
        populacao.obterBaratas();
        System.out.println("Os inseticidas acabaram!!! ._. ");
    }
    
}
