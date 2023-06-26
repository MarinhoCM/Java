// @author caua_marinho
package carro;
public class Carro {
    private double ConsumoDecombustivel;
    private double QuantidadeDeCombustivel;
    
    Carro(Double ConsumoDecombustivel) {
        this.ConsumoDecombustivel = ConsumoDecombustivel;
        this.QuantidadeDeCombustivel = 0.0;
    }
    //metodos
    public void andar(Double km) {
        ConsumoDecombustivel = (km/this.ConsumoDecombustivel);
        this.QuantidadeDeCombustivel -= ConsumoDecombustivel;
    }
     public Double obterGasolina() {
        return QuantidadeDeCombustivel;
    }
    public void adicionarGasolina(Double combustivel) {
        this.QuantidadeDeCombustivel += combustivel;
    }
    
    public static void main(String[] args) {
        System.out.println("Carro: Golf 2020");
        System.out.println("  ");
        Carro Golf = new Carro(10.);//consumo de 10 L/km         
        System.out.println("Combustível: " + Golf.obterGasolina()+" inicialmente");  
        System.out.println("Consumo: " + Golf.ConsumoDecombustivel);          
        System.out.println("Adcionar 60 litros de gasolina!");
        Golf.adicionarGasolina(60.);//abastece 60 litros          
        System.out.println("Tanque Golf: " + Golf.obterGasolina());          
        Golf.andar(80.);//Viaja 80 km          
        System.out.println("Andou 80km!");          
        System.out.println("Tanque Golf: " + Golf.obterGasolina()+" restante!");//combustivel restante
    } 
}
