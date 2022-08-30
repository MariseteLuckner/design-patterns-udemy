package br.com.solid.ocp.Veiculos;

public class Moto extends Veiculo {
    public Moto(String cor, String ano, double motor) {
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;

        configurarMoto();
    }

    private void configurarMoto() {
        System.out.println("Criando uma moto: " + "ano "+ ano + ",motor " + motor + " cilindradas");
        iniciarVeiculo();
    }
}
