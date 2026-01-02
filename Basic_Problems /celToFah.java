//convert Celcius Into  Fahrenheit.

import java.util.Scanner;
public class celToFah{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //Taking User input
    System.out.print("Enter Celcius :");
    int celcius = sc.nextInt();

    //Conversion
    int fahrenheit = (celcius * 9/5)+32;

    System.out.println("fahrenheit :" +fahrenheit );

  }
}
