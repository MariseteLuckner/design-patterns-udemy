package br.com.example.adapter.adapters;

import br.com.example.adapter.mercadoPago.MercadoPago;
import br.com.example.adapter.paypal.IPayPalPayments;
import br.com.example.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago){
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o mercado pago utilizando  os métodos padrões do paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendMPPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receiveMPPayment();
    }
}
