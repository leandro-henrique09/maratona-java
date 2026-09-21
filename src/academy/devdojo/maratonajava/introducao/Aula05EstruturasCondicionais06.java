package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil
        // ou final de semana considerando 1 como domingo.

        byte dia = 5;
        String diaSemana = "Dia de semana";
        String finalDeSemana = "Final de semana";

        switch (dia) {
            case 1:
                System.out.println("Domingo - "+finalDeSemana);
                break;
            case 2:
                System.out.println("Segunda - "+ diaSemana);
                break;
            case 3:
                System.out.println("Terça - "+ diaSemana);
                break;
            case 4:
                System.out.println("Quarta - "+ diaSemana);
                break;
            case 5:
                System.out.println("Quinta - "+ diaSemana);
                break;
            case 6:
                System.out.println("Sexta - "+ diaSemana);
                break;
            case 7:
                System.out.println("Sabádo - "+ finalDeSemana);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
