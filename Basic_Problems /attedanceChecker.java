// //Check Attendence and Marks
import java.util.Scanner;

public class attedanceChecker{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //Taking user input 
    System.out.print("ENTER YOUR ATTENDANCE = ");
    int attendance = sc.nextInt();

    System.out.print("ENTER YOUR MARKS = ");
    int marks = sc.nextInt();

   if(marks>=40 && attendance>=75){
    System.out.println("YOU ARE PASSED ");
   }
   else{
    System.out.println("YOU ARE FAILED ");
   }

   sc.close();

  }
}
