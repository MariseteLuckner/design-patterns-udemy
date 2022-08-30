package br.com.solid.ocp.Veiculos;

public class Carro implements IVeiculoCarro {
    private String cor;
    private String ano;
    private double motor;
    private int assentos;

    public Carro(String cor, String ano, double motor, int assentos) {
        configureVeiculo(cor, ano, motor, assentos);

    }

    @Override
    public void configureVeiculo(String cor, String ano, double motor, int assentos) {
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.assentos = assentos;

        System.out.println("Criando um carro com interface: " + cor + ", " + motor );
        ligarVeiculo();

    }

    @Override
    public void ligarVeiculo() {
        System.out.println("Ligando os motores com interface");

    }

}
