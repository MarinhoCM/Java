package academy.devdojo.maratonaJava.introducao;
public class Aula07Arrays1 {
    public static void main(String[] args) {
        int age = 15;
        int age2 = 20;
        int age3 = 21;
        // sintaxe = "tipo [] nome"
        int [] ages = new int[3]; // ou int ages[];
        // somente tipos de referencia podem ser iniciados como nulo;
        // exemplo (String, Arrays);
        System.out.println(ages[0]); // 0;
        System.out.println(ages[1]); // 0;
        System.out.println(ages[2]); // 0;
//        System.out.println(ages[3]); // Exception: Index of bounds;
        ages[0] = 21;
        ages[1] = 15;
        ages[2] = 11;
//        ages[3] = 11; // Exception: Index of bounds;
        System.out.println(ages[0]); // 21;
        System.out.println(ages[1]); // 15;
        System.out.println(ages[2]); // 11;
        // arrays em Java são considerados objetos;
    }
}
