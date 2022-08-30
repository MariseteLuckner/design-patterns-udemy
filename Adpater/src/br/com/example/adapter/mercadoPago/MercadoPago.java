package br.com.example.adapter.mercadoPago;

import br.com.example.adapter.utils.Token;

public class MercadoPago implements IMercadoPagoPayments{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendMPPayment() {
        System.out.println("Enviando pagamentos via mercado pago");
    }

    @Override
    public void receiveMPPayment() {
        System.out.println("Recebendo pagamentos via mercado pago");
    }
}
