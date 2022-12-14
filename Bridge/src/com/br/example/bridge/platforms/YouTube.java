package com.br.example.bridge.platforms;

public class YouTube implements IPlatform{

    public YouTube(){
        configureRMTP();
        System.out.println("YouTube: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: Configurando broadcasting");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando a aplicação");
    }
}
