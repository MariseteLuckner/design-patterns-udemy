package com.br.example.bridge.platforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: Gravação iniciada");
    }
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Configurando a gravação");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando a gravação");
    }
}
