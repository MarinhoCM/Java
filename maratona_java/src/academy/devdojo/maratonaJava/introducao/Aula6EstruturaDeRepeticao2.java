package academy.devdojo.maratonaJava.introducao;
public class Aula6EstruturaDeRepeticao2 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de
        // 0 a 1 milhão
        for(long num = 0; num <= 100000000;num++){
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
