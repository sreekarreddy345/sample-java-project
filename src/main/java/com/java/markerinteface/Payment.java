package com.java.markerinteface;

public class Payment implements BankDraft {

    public void paymentByCheque(){
        System.out.println("Payment by Cheque");
    }
    public void paymentByBankDraft(){
        System.out.println("Payment by BankDraft");
    }

}
