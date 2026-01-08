//Bank App 
import java.util.Scanner;

public class bankapp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    //New User Login
    System.out.print("Enter Username : ");
    String username = sc.next();

    //set password
    System.out.print("Set Password : ");
    int password = sc.nextInt();
    int balance = 10000;

    System.out.println("---Menu---");
    System.out.println("1.Check Balance");
    System.out.println("2.Deposit Money");
    System.out.println("3.Withdraw Money");
    System.out.println("4.Change Password");

    System.out.print("Choose Option :");
    int choose = sc.nextInt();

    switch(choose){
      case 1:
        {
          System.out.print("Enter Password : ");
          int checkPassword = sc.nextInt();

          if(checkPassword==password){
          System.out.println("Your Current Balance is : " +balance);
          }
          else{
            System.out.println("Inccorrect Password ! ,Enter Valid Password");
          }
        break;
        }

      case 2:
        {
         System.out.print("Enter Password : ");
         int checkPassword = sc.nextInt();

            if(checkPassword==password){
              System.out.print("Enter Ammount : ");
              int depositAmmount = sc.nextInt();
              balance = depositAmmount + balance;
              System.out.println("Rs."+depositAmmount+" Deposited in your Account");
              System.out.println("YOUR Current Balance is : " + balance);
             }
             else{
              System.out.println("Inccorrect Password ! ,Enter Valid Password");
             }
        break;
        }
      case 3:
        {
         System.out.print("Enter Password : ");
         int checkPassword = sc.nextInt();
          
        if(checkPassword==password){
          System.out.print("Enter Ammount : ");
          int withdrawAmmount = sc.nextInt();

          if(withdrawAmmount<0){
            System.out.println("Enter a Valid Ammount");
           }
          else if(balance>=withdrawAmmount){
             System.out.println("Rs."+ withdrawAmmount + "withdrawn from your Account");
             balance = balance - withdrawAmmount;
             System.out.println("Your Current Balance is Rs."+ balance+ ", Thank You !");
             }
            else{
              System.out.println("Insufficient Balance !");
            }
          } 
        else{
            System.out.println("Inccorrect Password ! ,Enter Valid Password");
          }
       break; 
      }
      case 4 :
        {
          System.out.print("Enter Password : ");
          int checkpassword = sc.nextInt();

          if(checkpassword==password){
            System.out.print("Enter New  Password : ");
            int newPass = sc.nextInt();
            password = newPass;

            System.out.println("Password Changed Successfully !, Thank You");
          }

          else{
            System.out.println("Enter Valid Password");
          }
        break;
        }
    }
  }
}
