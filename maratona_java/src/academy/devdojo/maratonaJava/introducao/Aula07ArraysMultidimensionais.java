package academy.devdojo.maratonaJava.introducao;
public class Aula07ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30, 30 dias
        int[][] days = new int[3][3];
        System.out.println(days[0]); // endereço de memoria;
        System.out.println(days[0][0]); // 0;
        System.out.println("exercice: ");
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 11;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 11;

        days[2][0] = 31;
        days[2][1] = 28;
        days[2][2] = 11;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length ; j++) {
                System.out.println(days[i][j]);

            }
        }
    }
}
