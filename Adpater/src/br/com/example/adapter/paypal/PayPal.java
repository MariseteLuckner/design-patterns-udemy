package br.com.example.adapter.paypal;

import br.com.example.adapter.utils.Token;

public class PayPal implements IPayPalPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamento via paypal");

    }
}
