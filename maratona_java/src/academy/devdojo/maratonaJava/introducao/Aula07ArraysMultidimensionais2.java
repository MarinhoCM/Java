package academy.devdojo.maratonaJava.introducao;

public class Aula07ArraysMultidimensionais2 {
    public static void main(String[] args) {
//        int[][] arrayInt = new int[2][];
//        for (int[] arrBase: arrayInt){
//            for (int arr: arrBase){
//                System.out.println(arr);
//                /*Exception: no pointer*/
//            }
//        }
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int[][] array2 = {
            {0,0},
            {1,2,3},
            {1,2,3,4,5,6}
        };

        for (int[] arrBase: array2){
            System.out.println("\n---------");
            for (int arr: arrBase){
                System.out.print(arr +" ");
            }
        }

    }
}
