package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.setNome("Marcio");
        funcionario01.setIdade(54);
        funcionario01.setSalarios(new double[]{2500, 3000, 4500});

        funcionario01.imprimeDados();
    }
}
