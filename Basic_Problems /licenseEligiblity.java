//Check Weather user is eligible for driving license 
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //Taking user input
    System.out.print("ENTER NAME :");
    String name = sc.next();

    System.out.print("Enter AGE :");
    int age = sc.nextInt();


    //Check Weather eligible or not 
    if(age>=18){
      System.out.println("Hello "+ name+ " ,You are eligible for Driving license");
    }
    else
    {
      System.out.println("Hello "+ name+ " ,You are not eligible for Driving license");
    }
  }
}
