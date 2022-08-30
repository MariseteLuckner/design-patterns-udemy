package com.br.example.bridge.transmissions;

import com.br.example.bridge.platforms.IPlatform;

public class RecordLive extends Live{

    public RecordLive(IPlatform platform){
        this.platform = platform;
    }

    public void record(){
        System.out.println("Iniciando a gravação da live!");
    }
}
