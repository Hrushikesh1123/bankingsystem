package com.BankingSystem;

public class Bankauth {
  static int count=0;
   static void login(int password){
      if(password==1234){
        System.out.println("welcome to the bank...!");

      }
      else if(count==3){
        System.out.println("session logged out...!");
        //Bankauth obj=new Bankauth();
      //  wait();
        for(int i=0;i<100000;i++);count=0;
      }
      else{
        System.out.println("Invalid password ");count++;
      }
  }

}
