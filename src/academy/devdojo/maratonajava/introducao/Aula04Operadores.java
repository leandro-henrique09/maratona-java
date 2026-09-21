package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 * numero02;
        System.out.println("Resultado: " + resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte? " + isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte? " + isDezIgualVinte);
        System.out.println("Dez é igual a dez? " + isDezIgualDez);
        System.out.println("Dez é diferente de dez? " + isDezDiferenteDeDez);

        // &&(AND) ||(OR) !(NOT)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("Está dentro da lei Maior que Trinta? " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei Menor que Trinta? " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;

        System.out.println("Consegue comprar o PlayStation? "+ isPlaystationCincoCompravel);

        // =  += -+ *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 5; // contador = contador + 5
        contador++; // contador = contador + 1
        contador--; // contador = contador - 1
        ++contador; //
        --contador; //
    }
}
