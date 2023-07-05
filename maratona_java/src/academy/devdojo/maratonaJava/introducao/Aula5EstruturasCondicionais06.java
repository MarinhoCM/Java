package academy.devdojo.maratonaJava.introducao;

public class Aula5EstruturasCondicionais06 {
    public static void main(String[] args) {
        // dados os valores 1 a 7 imprima o dia util ou final de semana
        // considerando 1 como domingo (com switch)
        byte dia = 3;
        switch (dia){
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("isso não é um dia valido!");
                break;
        }
    }
}
