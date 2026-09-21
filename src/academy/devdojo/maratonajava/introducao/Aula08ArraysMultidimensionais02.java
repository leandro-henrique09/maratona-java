package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];


        arrayInt[0] = new int[3];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{1, 1}, {2, 3, 4}, {2, 3, 4, 5, 6, 7}};

        for (int[] arrayBase : arrayInt) {
            for (int valor : arrayBase) {
                System.out.println(valor);
            }
            System.out.println("\n-----");
        }

        System.out.println("Divisão de um array pro outro");

        for (int[] arrayBase : arrayInt2) {
            for (int valor : arrayBase) {
                System.out.println(valor);
            }
            System.out.println("\n-----");
        }
    }
}
