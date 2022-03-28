package com.BankingSystem;

public class nationalBank implements Accounts{
   // @Override
   static double Earned_amount=0;
    protected double balance=0;
    public int account;
    public String name;
    private final String bankname="nationalbank";
    nationalBank(int number,String name,double money){
        this.account=number;
        this.name=name;
        this.balance=money;

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
    public  int AccountNumber() {
        return this.account;
    }

    @Override
    public double AvailableBalance() {
        return this.balance;
    }
    public static void reserves(){
        System.out.println("total reserves of national bank "+Earned_amount);
        System.out.println(" ");
    }
}
