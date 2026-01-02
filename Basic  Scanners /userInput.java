//Taking input in java


import java.util.Scanner;

public class userInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name = sc.nextLine();

    System.out.println("Name" +name);
  }
}

//EXAMPLE//
// sum of double vvariables 
import java.util.Scanner;
public class userInput{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    
    System.out.println("Num1="+ num1);
    System.out.println("Num2="+ num2);
    double sum = num1 + num2;
    System.out.println("Result:" + sum);
  }
}
