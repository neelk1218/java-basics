// Bank Account 
import java.util.Scanner;
class bankAcc{
  String name;
  int age;
  int balance;
  int pass;
  int checkPass;
  int addMoney;
  int withdraw;
  Scanner sc = new Scanner(System.in);

  bankAcc(){
    System.out.print("Enter Name : " );
    name = sc.nextLine();
    System.out.println("Enter Age : " );
    age = sc.nextInt();
    System.out.println("Create Pass: ");
    pass = sc.nextInt();
    System.out.println("Add funds to Create Acc (Min 1000) : ");
    balance = sc.nextInt();
  }
  
  void addMoney(){
    System.out.println("Enter ammount :");
    addMoney = sc.nextInt();
    System.out.print("Enter pin:");
    checkPass = sc.nextInt();

    if(checkPass == pass){
    balance = addMoney+balance;
     System.out.println("Rs."+addMoney+" added, Your current balance "+ balance);
    }
    else{
      System.out.println("InCorrect Password , Enter valid!");
    }
  }

  void withdrawMoney(){
    System.out.print("Enter ammount :");
    withdraw= sc.nextInt();
    System.out.print("Enter pin:");
    checkPass = sc.nextInt();
    
    if(checkPass == pass){
    balance = withdraw-balance;
    if(balance>=withdraw){
     System.out.println("Rs."+withdraw+" debited, Your current balance "+ balance);
    }
    else{
      System.out.println("Insufficient Balance");
    }
    }
    else{
      System.out.println("InCorrect Password , Enter valid!");
    }
  }
 
  void CheckBal(){
    System.out.print("Enter pin:");
    checkPass = sc.nextInt();
    
    if(checkPass == pass){
     System.out.println("Your current balance "+ balance);
    }
    else{
      System.out.println("InCorrect Password , Enter valid!");
    }
  }   
}
public class bankapp{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
      bankAcc ba = new bankAcc();
     
    System.out.println("---Menu---");
    System.out.println("1.Check Balance");
    System.out.println("2.Deposit Money");
    System.out.println("3.Withdraw Money");
 

    System.out.print("Choose Option :");
    int choose = in.nextInt();
    switch(choose){
      case 1 :
        ba. CheckBal();
        break;
      case 2:
        ba.addMoney();
        break;
      case 3:
        ba.withdrawMoney();
        break;
      default:
        System.out.println("choose Valid option");
      }          
    }
  }

