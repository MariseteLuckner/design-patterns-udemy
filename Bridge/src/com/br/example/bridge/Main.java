package com.br.example.bridge;

import com.br.example.bridge.platforms.*;
import com.br.example.bridge.transmissions.AdvancedLive;
import com.br.example.bridge.transmissions.Live;
import com.br.example.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
//        startLive(new YouTube());
//        startLive(new TwitchTV());
//        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform){
       /* System.out.println("Aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();

        */

        /*
        System.out.println("Transmissão avançada...Aguarde!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();

         */

        System.out.println("Aguarde!");
        RecordLive recordLive = new RecordLive(platform);
        recordLive.record();
    }

}
