
//find Area of circle 
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("ENTER RADIUS: ");
    double radius = sc.nextDouble();

    //cal area of circle 
    double result = 3.14 * radius *radius;
    System.out.println("AREA OF CIRCLE IS :"+ result);
   
    sc.close();

  }
}
