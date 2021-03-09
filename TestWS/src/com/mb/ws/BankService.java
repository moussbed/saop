package com.mb.ws;

import com.mb.models.Account;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

@WebService(name = "BankWS")
public class BankService {

    @WebMethod(operationName = "conversionEuroToXAF")
    public double conversion(@WebParam(name = "account") double montant){
     return montant * 650;
    }

    @WebMethod
    public Account getAcccount(@WebParam(name = "code") Long code){

        return new Account(code, new Random().nextDouble()*100, new Date());
    }

    @WebMethod
    public List<Account>  listAccount(){

        return Arrays.asList(new Account(1L, new Random().nextDouble() * 100, new Date()),
                new Account(2L, new Random().nextDouble() * 200, new Date()),
                new Account(3L, new Random().nextDouble() * 300, new Date())
        );
    }
}
