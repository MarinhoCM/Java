package academy.devdojo.maratonaJava.introducao;
public class Aula07Arrays2Iter {
    public static void main(String[] args) {
        // byte, short, int, float e double = 0;
        // char = '\u0000';
        // boolean false;
        // String null;
//        String [] ages = new String[4];
//        System.out.println(ages[0]); // null;
//        System.out.println(ages[1]); // null;
//        System.out.println(ages[2]); // null;
//        System.out.println(ages[3]); // null;
        String [] names = new String[4];
        names[0] = "Goku";
        names[1] = "Vegeta";
        names[2] = "Bulma";
        names[3] = "Kuririn";
        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i]);
        }
    }
}
