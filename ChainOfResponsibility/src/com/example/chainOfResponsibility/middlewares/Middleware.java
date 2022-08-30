package com.example.chainOfResponsibility.middlewares;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    public abstract boolean ckeck(String email, String password);

    protected boolean checkNext(String email, String password){
        if(next ==null){
            return true;
        }

        return next.ckeck(email, password);
    }

}
