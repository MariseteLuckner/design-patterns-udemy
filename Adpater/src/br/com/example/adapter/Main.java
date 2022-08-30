package br.com.example.adapter;

import br.com.example.adapter.adapters.MercadoPagoAdapter;
import br.com.example.adapter.mercadoPago.MercadoPago;
import br.com.example.adapter.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}
