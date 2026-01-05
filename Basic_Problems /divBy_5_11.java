//check if the number is divisible by 5 and 11 
import java.util.Scanner;
public class divBy_5_11{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);


    //taking user input
    System.out.print("ENTER A NUMBER : ");
    int num = sc.nextInt();

    //Check if the Number is Divisible by 5 and 11 
    if(num%5== 0 && num%11==0){
      System.out.println(num +" is divisible by 5 and 11");
    }
    else{
      System.out.println(num +" is not Divisible by 5 and 11");
    }
    sc.close();
  }
}
