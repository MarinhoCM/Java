package academy.devdojo.maratonaJava.introducao;

public class Aula07Arrays3 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{1,2,3,4,5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
