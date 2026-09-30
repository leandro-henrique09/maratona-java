package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) return;
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) return;
        double somaSalario = 0;
        for (double salario : salarios) {
            somaSalario += salario;
        }
        System.out.println("\nA média de salário é: " + (somaSalario / salarios.length));
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
