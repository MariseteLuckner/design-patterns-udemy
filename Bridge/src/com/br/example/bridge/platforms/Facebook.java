package com.br.example.bridge.platforms;

public class Facebook implements IPlatform{

    public Facebook(){
        System.out.println("Facebook: Iniciando a transmissão");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Fecebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação");
    }
}
