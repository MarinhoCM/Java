package academy.devdojo.maratonaJava.introducao;

public class Aula5EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana
        // considerando domingo como 1
        byte dia = 5;
        /*if (dia == 1){
            System.out.println(
                "Hoje é domingo!"
            );
        } else if(dia == 2){
            System.out.println(
                "Hoje é segunda!"
            );
        } else if (dia == 3) {
            System.out.println(
                "Hoje é terça!"
            );
        } else if (dia == 4) {
            System.out.println(
                "Hoje é quarta!"
            );
        } else if (dia == 5) {
            System.out.println(
                "Hoje é quinta!"
            );
        } else if (dia == 6) {
            System.out.println(
                "Hoje é sexta!"
            );
        } else if (dia == 7) {
            System.out.println(
                "Hoje é sabado!"
            );
        } else {
            System.out.println(
                "Isso não é um dia da semana!"
            );
            outra forma é utilizando o switch
        }*/
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homen");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Tipo inexistente!");
                break;
        }
    }
}
