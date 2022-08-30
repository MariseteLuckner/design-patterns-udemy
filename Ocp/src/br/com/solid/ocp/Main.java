package br.com.solid.ocp;

import br.com.solid.ocp.Veiculos.Carro;
import br.com.solid.ocp.Veiculos.Moto;
import br.com.solid.ocp.Veiculos.TipoDeVeiculo;
import br.com.solid.ocp.Veiculos.Veiculo;

public class Main {
    private static TipoDeVeiculo tipoDeVeiculo;

    public static void main(String[] args) {
        tipoDeVeiculo = TipoDeVeiculo.CARRO;

        if (tipoDeVeiculo == TipoDeVeiculo.CARRO) {
            Carro carro = new Carro("Prata", "2020", 1.6, 4);
        }else if (tipoDeVeiculo == TipoDeVeiculo.MOTO) {
            Moto moto = new Moto("Branca", "2021", 250);

        }
    }



}
