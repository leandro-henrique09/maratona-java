package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses
        // 31, 28, 31, 30 dias

        int[][] dias = new int[2][2];

        dias[0][0] = 10;
        dias[0][1] = 20;

        dias[1][0] = 15;
        dias[1][1] = 16;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }

        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for(int[] arrBase: numeros) {
            for(int num: arrBase) {
                if(num % 2 == 0){
                    continue;
                } else {
                    System.out.println(num);
                }
            }
        }

        String[][] frutas = {
                {"Pera", "Uva Verde", "Abacate"},
                {"Laranja", "Pessego", "Mamão"},
                {"Melancia", "Amora", "Acerola"}
        };

        for(String[] arrFrutas: frutas) {
            for(String fruta: arrFrutas) {
                System.out.println(fruta);
                if (fruta == "Abacate") {
                    System.out.println("Chegou no abacate");
                    System.out.println("Partindo pro proximo Array.");
                }
                if (fruta == "Mamão") {
                    System.out.println("Chegou no Mamão");
                    System.out.println("Partindo pro proximo Array.");
                }
            }
        }

        double[][] notas = {
                {7.5, 8.0, 6.5, 9.0},
                {5.0, 6.0, 7.0, 5.5},
                {9.0, 8.5, 9.5, 10.0}
        };

//        for(double[] arrNotas: notas) {
//            double somaNotaAluno = 0;
//
//            for (int i = 0; i < arrNotas.length; i++) {
//                somaNotaAluno += arrNotas[i];
//            }
//
//            double media = somaNotaAluno / arrNotas.length;
//
//            System.out.println(media);
//        };

        for(double[] arrNotas: notas) {
            double media = 0;

            for(double nota: arrNotas) {
                media += nota;
                System.out.println("Somando...");
            }
            System.out.println("Media: "+media/arrNotas.length);
        };

        int[][] arrays = {
                {2, 7, 9},
                {3, 6, 2},
                {8, 9, 1}
        };

        int soma = 0;

        for(int[] array: arrays) {
            for(int inteiro: array) {
                System.out.println(inteiro);
                soma += inteiro;
            }
            System.out.println("-------- Média: "+ soma/array.length);
        }
    }
}
