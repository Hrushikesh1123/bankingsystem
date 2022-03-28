package com.BankingSystem;

public class internationalbank implements Accounts{
    static double Earned_amount=0;
    protected double balance=0;
    public int account;
    public String name;
    static int total_accounts=0;
   //
   // private final String bankname="internationalbank";
    internationalbank(int number, String name, double money){
        this.account=number;
        this.name=name;
        this.balance=money;
        total_accounts+=1;

    }

    @Override
    public void AccountDetails() {
        System.out.println("account details are as follow");
        System.out.println("account holder name "+this.name);
        System.out.println("account holder accountId "+this.account);
        System.out.println("account holder total balance "+this.balance);
        System.out.println("");
    }

    @Override
    public int AccountNumber() {
        return this.account;
    }

    @Override
    public double AvailableBalance() {
        return this.balance;
    }
    public static void reserves(){
        System.out.println("total reserves of international bank "+Earned_amount);
        System.out.println(" ");
    }
}
