package br.com.solid.lsp;

abstract public class NubankCard implements IPaymentInstrument{

    @Override
    public void validate() throws Exception {
        //Validação Basica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamenoto realizado.");

    }
}
