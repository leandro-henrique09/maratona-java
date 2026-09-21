package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vezez ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 42850;
        for(int i = 1; i < valorTotal; i++){
            double valorParcela = valorTotal / i;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Em "+i+" vezes é = "+valorParcela);
        }

    }
}
