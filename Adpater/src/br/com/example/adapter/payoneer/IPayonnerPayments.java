package br.com.example.adapter.payoneer;

import br.com.example.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
