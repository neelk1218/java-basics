// // import java.util.Scanner;

public class checkNum1_50{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //taking user input //
    System.out.print("Enter a Number : ");
    int num =  sc.nextInt();

    //Check Whether the Number lies Whitin 10 to 50 
    if(num>=10 && num<=50){
      System.out.println("Number Lies Between 10 to 50");
    }
    else{
      System.out.println("Number does not lies Between 10 to 50");
    }
  
  }
}/
