package academy.devdojo.maratonaJava.introducao;

public class Aula5EstruturasCondicionais {/*
    public static void main(String[] args) {
        if(true){
            System.out.println("Dentro do if!");
        }
        // outra forma
        // if (true){System.out.printnl("dentro do if!");}
        System.out.println("fora do if!");
    }*/

 /*   public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;
        if (isAutorizadoComprarBebida) {
            System.out.println(
                "Autorizado a comprar bebida alcollica"
            );
        } else {
            System.out.println(
                "Você não possui idade suficiente para beber"
            );
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println(
                "Autorizado a comprar bebida alcollica"
            );
        }
    }
*/
    public static void main(String[] args) {
        int idade = 17;
        if (idade < 15){
            System.out.println("Categoria infantil");
        } else if(idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil!");
        } else {
            System.out.println("Categoria adulto!");
        }
        System.out.println("idade: "+idade);
    }
}
