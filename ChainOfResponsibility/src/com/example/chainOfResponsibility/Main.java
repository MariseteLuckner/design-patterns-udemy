package com.example.chainOfResponsibility;

import com.example.chainOfResponsibility.middlewares.CheckPermissionMiddleware;
import com.example.chainOfResponsibility.middlewares.CheckUserMiddleware;
import com.example.chainOfResponsibility.middlewares.Middleware;
import com.example.chainOfResponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Server server;

    public static void init(){
        server = new Server();
        server.registerUsers("master@email.com", "12345678");
        server.registerUsers("user@email.com", "87654321");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do{
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email, password);

        }while (!done);

    }
}
