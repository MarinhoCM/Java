package academy.devdojo.maratonaJava.introducao;

public class Aula6EstruturaDeRepeticao4 {
    // dado o valor de um carro descubra em quantas parcelas
    // ele poderá ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal =   50000;
        for (int parcela = 0; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            if(valorParcela >= 1000){
                System.out.println("Parcela: "+parcela+ " R$ "+valorParcela);
            }
        }
    }
}
