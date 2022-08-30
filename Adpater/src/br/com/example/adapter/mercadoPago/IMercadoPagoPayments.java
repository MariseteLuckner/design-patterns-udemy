package br.com.example.adapter.mercadoPago;

import br.com.example.adapter.utils.Token;

public interface IMercadoPagoPayments {

    Token authToken();
    void sendMPPayment();
    void receiveMPPayment();
}
