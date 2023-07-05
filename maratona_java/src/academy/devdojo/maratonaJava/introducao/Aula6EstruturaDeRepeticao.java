package academy.devdojo.maratonaJava.introducao;
public class Aula6EstruturaDeRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count <= 10){
            System.out.println(count++);
        }
        do {
            System.out.println("Dentro do do-while");
        } while (count < 10);
        for(int i=0;i<10;i++){
            System.out.println("For: "+i);
        }
    }
}
