import java.util.Scanner;
public class simpleInterest{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //taking user input
    System.out.print("Enter Principle Amount :");
    int princpleAmount = sc.nextInt();

    System.out.print("Enter Rate of Intrest :");
    int rateOfIntrest = sc.nextInt();

    System.out.print("Enter Time in Year :");
    int timeInYears = sc.nextInt();

    //Calculating simple Intrest
    int simpleIntrest = (princpleAmount *rateOfIntrest* timeInYears)/100 ;
    System.out.println("Simple Intrest for "+timeInYears +" years is "+ simpleIntrest);


  }
}
