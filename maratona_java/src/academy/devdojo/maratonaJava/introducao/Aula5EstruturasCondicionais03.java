package academy.devdojo.maratonaJava.introducao;
public class Aula5EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mesagemDoar = (
            "Eu vou doar 500 reais"
        );
        String mesagemNaoDoar = (
              "Ainda não tenho condições de doar :("
        );
        /*String resultado;
        if (salario > 5000){
            resultado = mesagemDoar;
        } else {
            resultado = mesagemNaoDoar;
        }
        System.out.println(resultado);*/

        // operador ternario
        // sintaxe (condição) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mesagemDoar : mesagemNaoDoar;
        System.out.println(resultado);
    }
}
