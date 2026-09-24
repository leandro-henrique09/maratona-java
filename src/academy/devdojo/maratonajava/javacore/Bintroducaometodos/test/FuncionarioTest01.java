package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.nome = "Marcio";
        funcionario01.idade = 54;
//        funcionario01.salarios = new double[]{2500, 3000, 4500};

        funcionario02.nome = "Leandro";
        funcionario02.idade = 22;
        funcionario02.salarios = new double[]{4850, 4325.89, 2589.50};

        funcionario02.imprimeDados();
        funcionario01.imprimeDados();
    }
}
