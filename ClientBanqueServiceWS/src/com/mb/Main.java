package com.mb;


import mypackage.Account;
import mypackage.BankServiceService;
import mypackage.BankWS;

/*
  - you can use that to generate the stub in command line
    $ wsimport -s . http://localhost:8087/BankService?wsdl

  - wsimport is in the bin of jdk

 */

public class Main {

    public static void main(String ... args) {

        BankWS stub = new BankServiceService().getBankWSPort();

        double euroToXAF = stub.conversionEuroToXAF(2000);

        System.out.println(euroToXAF);

        Account account = stub.getAcccount(1L);

        System.out.println(account);

        for (Account a : stub.listAccount()) {
            System.out.println("------------------");
            System.out.println(a);
        }



    }
}
