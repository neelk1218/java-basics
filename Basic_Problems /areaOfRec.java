
//Find Area of Circle 
import java.util.Scanner;
public class areaOfRec{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Length :");
    int length = sc.nextInt();
    System.out.print("Enter breadth :");
    int Breadth = sc.nextInt();
    
    int area = length * Breadth;
    System.out.println("Area of Rectangle =" + area);
  
  }
}
