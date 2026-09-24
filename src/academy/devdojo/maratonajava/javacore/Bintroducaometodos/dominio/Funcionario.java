package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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
}
