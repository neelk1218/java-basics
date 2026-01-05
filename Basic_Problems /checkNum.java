//check wheter the number is postive negative or zero 

import java.util.Scanner;
public class checkNum{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //taking user input
    System.out.println("Enter a Number : ");
    int num = sc.nextInt();

    //checking 
    if(num<0){
      System.out.println(num + "is a Negative Number");
    }
    else if(num == 0){
      System.out.println( " Its  a Zero");
    }
    else{
      System.out.println(num + "is a Positive Number");
    }
    sc.close();
  }
}
