package com.example.chainOfResponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware{
    @Override
    public boolean ckeck(String email, String password) {
        if(email.equals("master@email.com")){
            System.out.println("Bem vindo administrador");
            return true;
        }
        System.out.println("Bem vindo!");
        return checkNext(email, password);
    }
}
