package app;

import java.util.ArrayList;
import java.util.List;
import model.Carro;
import model.CarroEletrico;
import model.Moto;
import model.Recarregavel;
import model.Veiculo;

public class Main {

    public static void main(String[] args) {

        // Veiculo veiculo = new Veiculo("ABC-1234", "Genérico", 100.0);
        // Não pode ser criado porque Veiculo é uma classe abstrata.

        Carro carro = new Carro("ABC-1234", "Toyota Corolla", 150.0);
        Moto moto = new Moto("DEF-5678", "Honda CG", 80.0);
        CarroEletrico carroEletrico =
                new CarroEletrico("GHI-9012", "Tesla Model 3", 200.0, 10.0);

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(carroEletrico);

        System.out.println("=== VEÍCULOS ===");

        int diasCarro = 3;
        int diasMoto = 4;
        int diasEletrico = 3;

        for (Veiculo veiculo : veiculos) {
            veiculo.imprimirResumo();

            int dias;

            if (veiculo == carro) {
                dias = diasCarro;
            } else if (veiculo == moto) {
                dias = diasMoto;
            } else {
                dias = diasEletrico;
            }

            System.out.println("Aluguel: R$ " + veiculo.calcularAluguel(dias));
            System.out.println();
        }

        // Teste específico da moto com 5 dias
        System.out.println("=== TESTE MOTO 5 DIAS ===");
        System.out.println("Aluguel: R$ " + moto.calcularAluguel(5));

        System.out.println();
        System.out.println("=== RECARGA ===");

        List<Recarregavel> eletricos = new ArrayList<>();
        eletricos.add(carroEletrico);

        for (Recarregavel eletrico : eletricos) {
            System.out.println("Recarga: R$ " + eletrico.calcularRecarga(3));
        }
    }
}
