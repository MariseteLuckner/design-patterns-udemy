package br.com.solid.lsp;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();
}
