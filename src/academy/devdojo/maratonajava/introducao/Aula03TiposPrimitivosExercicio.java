package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Leandro";
        String endereco = "Av Paulista, 1000, Apto 52 - Bela Vista - São Paulo – SP";
        float salario = 2500;
        String data = "17/09/2026";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".");
    }
}
