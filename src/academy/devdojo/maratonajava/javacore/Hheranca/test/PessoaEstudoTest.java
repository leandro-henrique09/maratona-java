package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.ClienteEstudo;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.FuncionarioEstudo;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.PessoaEstudo;

public class PessoaEstudoTest {
    public static void main(String[] args) {
        PessoaEstudo pessoa = new PessoaEstudo();

        pessoa.setNome("Leandro Henrique");
        pessoa.setIdade(22);
        pessoa.setCpf("123.123.123-12");
        pessoa.setEndereco("Rua Brasil, 1983 - SP");

        pessoa.imprime();
        System.out.println("----------- FUNCIONARIO ------------");

        FuncionarioEstudo funcionario = new FuncionarioEstudo();
        funcionario.setNome("Lucas Oliveira");
        funcionario.setIdade(25);
        funcionario.setCpf("345.567.678-09");
        funcionario.setEndereco("Rua Alemanha, 2006 - RJ");
        funcionario.setMatricula(352);
        funcionario.setDepartamento("DITI");
        funcionario.setFuncao("Analista de Infraestrura");

        funcionario.identificacaoUsuario();
        funcionario.imprime();

        System.out.println("----------- CLIENTE -------------");

        ClienteEstudo cliente = new ClienteEstudo(1003);
        cliente.setNome("Marcos Vieira");
        cliente.setIdade(45);
        cliente.setCpf("543.765.124-12");
        cliente.setEndereco("Rua Chile, 997 - MG");
//        cliente.setIdIdentificacao(1003);

        cliente.imprime();
    }
}
