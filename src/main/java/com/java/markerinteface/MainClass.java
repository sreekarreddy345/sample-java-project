package com.java.markerinteface;

public class MainClass {

    public static void main(String[] args) {
        Payment p = new Payment();
        if (p instanceof Cheque) {
            p.paymentByCheque();
        } else if (p instanceof BankDraft) {
            p.paymentByBankDraft();
        }
    }
}
