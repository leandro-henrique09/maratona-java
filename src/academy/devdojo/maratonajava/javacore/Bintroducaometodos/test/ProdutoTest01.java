package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto produto01 = new Produto();

        produto01.setNome("Teclado");
        produto01.setPreco(150);

        System.out.println("Nome do produto: "+produto01.getNome());
        System.out.println("Preço do produto: "+produto01.getPreco());
//        produto01.retiraEstoque(22);
        System.out.println("===========================");
        produto01.adicionarEstoque(25);
    }
}
