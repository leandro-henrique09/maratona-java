package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 100000;
        double taxa;
        double descontoImposto;

        if(salario <= 34712){
            taxa = 9.70;
            descontoImposto = salario * (taxa / 100);
        } else if(salario >= 34713 && salario <= 68507){
            taxa = 37.35;
            descontoImposto = salario * (taxa / 100);
        } else {
            taxa = 49.50;
            descontoImposto = salario * (taxa / 100);
        }
        System.out.println(descontoImposto);
    }
}
