package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque = 25;


    private boolean quantidadeValida(int quantidade) {
        return quantidade > 0;
    }

    public void retiraEstoque(int quantidade) {
        if(!quantidadeValida(quantidade) || quantidade > quantidadeEstoque) {
            System.out.println("Falha na transação! A quantidade não pode ser menor do que 0 e não pode ultrapassar o valor de estoque!");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Retirada realizada!");
            System.out.println("Saldo atualizado: " + quantidadeEstoque);
        }
    }

    public void adicionarEstoque(int quantidade) {
            if(quantidadeValida(quantidade)) {
                System.out.println("Estoque atualizado com sucesso! ");
                quantidadeEstoque += quantidade;
                System.out.println("Novo saldo: " + quantidadeEstoque);
            } else
                System.out.println("A quantidade é inválida.");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            return;
        }
        this.quantidadeEstoque = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidadeEstoque;
    }
}
