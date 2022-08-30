package com.br.example.bridge.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV(){
        configureRMTP();
        System.out.println("TwitchTV: Iniciando a transmissão");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal");
    }
}
