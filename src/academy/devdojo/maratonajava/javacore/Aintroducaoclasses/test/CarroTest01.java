package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // carro 1
        carro1.nome = "Palio";
        carro1.modelo = "Fire";
        carro1.ano = 2005;

        // carro 2
        carro2.nome = "Corsa";
        carro2.modelo = "Classic";
        carro2.ano = 2013;

        carro1 = carro2;

        System.out.println("Carro 1 - "+carro1.nome+ " | "+ carro1.modelo+ " | "+ carro1.ano);
        System.out.println("Carro 2 - "+carro2.nome+ " | "+ carro2.modelo+ " | "+ carro2.ano);
    }
}
