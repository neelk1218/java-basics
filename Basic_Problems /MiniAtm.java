//Bank Mini ATM Stimulation

import java.util.Scanner;

public class MiniAtm{
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    int accBalance = 10000;

    //taking Withdrawal Ammount 
    System.out.print("Enter Ammount : ");
    int withdrawalAmmount= sc.nextInt();

    
    if(withdrawalAmmount<=0){
      System.out.println("Enter a Valid Number");
    }
    else if(withdrawalAmmount<=accBalance){
      System.out.println("Rs " +withdrawalAmmount +" withdrawn from your Account");
      int currentBalance = accBalance - withdrawalAmmount;

      System.out.println("Current Balance is " + currentBalance);
    }
    else{
      System.out.println("Insufficient Balanace");
    }

    sc.close();

  }
}
