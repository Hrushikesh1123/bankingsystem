package com.BankingSystem;

public class Transaction {

    static double gas =5.0;
    static double otherbank=15.0;
    Transaction() {
        super();
    }
   static void interexchange(nationalBank A1,nationalBank A2, double amount_tran){

        double bal= A1.AvailableBalance();
        double fees=(amount_tran*(gas/100));
       //System.out.println(fees);
        if(bal>(amount_tran+fees)){
            //int temp=bal-amount_tran;
            A1.balance-=(amount_tran+fees);
            nationalBank.Earned_amount+=fees;
            A2.balance+=amount_tran;
            System.out.println("transaction is successfully done...!");
            System.out.println("Available balance is "+A1.balance);
            System.out.println("transaction fees applied as "+fees);
            System.out.println("");
        }
        else{
            System.out.println("You dont have enough amount to make a transaction");
        }
    }
    static void intraexchange(nationalBank A1,internationalbank A2,int amount_tran){
        double bal= A1.AvailableBalance();
        double fees=(amount_tran*(otherbank/100));
       // System.out.println(fees);
        if(bal>(amount_tran+fees)){
            //int temp=bal-amount_tran;
            A1.balance-=(amount_tran+fees);
            internationalbank.Earned_amount+=(fees/2);
            nationalBank.Earned_amount+=fees/2;
            A2.balance+=amount_tran;
            System.out.println("transaction is successfully done...!");
            System.out.println("Available balance is "+A1.balance);
            System.out.println("transaction fees applied as "+fees);
            System.out.println("");

        }
        else{
            System.out.println("You dont have enough amount to make a transaction");
            System.out.println("Try to put valid amount..!");
        }


    }



}
