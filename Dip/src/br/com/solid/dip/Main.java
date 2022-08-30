package br.com.solid.dip;

import br.com.solid.dip.payment.Payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
