package com.mb;

import com.mb.ws.BankService;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8087/",new BankService());

        System.out.println("**************************************");
        System.out.println("************START*********************");
        System.out.println("**************************************");
    }
}
