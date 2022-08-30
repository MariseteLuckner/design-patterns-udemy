package com.br.example.bridge.transmissions;

import com.br.example.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatform platform){
        this.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na live!");
    }
}
