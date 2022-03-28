package com.BankingSystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       ArrayList<nationalBank>account1=new ArrayList<>();
       ArrayList<internationalbank>account2=new ArrayList<>();
       account1.add(new nationalBank(1234,"hrushikesh",1000));
       account1.add(new nationalBank(1235,"sandesh",2000));
       account2.add(new internationalbank(1234,"prabhu",1000));
       Transaction.interexchange(account1.get(0),account1.get(1),200);
      Transaction.intraexchange(account1.get(0),account2.get(0),300);
      account1.get(0).AccountDetails();//ccountdetails()
        nationalBank.reserves();
        internationalbank.reserves();
        Transaction.interexchange(account1.get(0),account1.get(1),2000);


    }
}
