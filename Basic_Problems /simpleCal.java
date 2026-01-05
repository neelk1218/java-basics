//*Calculator 
//  */
import java.util.Scanner;

public class simpleCal{
  public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);

    //TAKING USER INPUT 
    System.out.print("Enter Numbers 1=");
    int num1 = sc.nextInt();

    System.out.print("Enter  Number 2 =");
    int num2 = sc.nextInt();

    System.out.print("Enter Any Operator (+,-,/,*) :");
    char operator = sc.next().charAt(0);

    //Switch Case

   switch(operator){
    case  '+' :
      {
        System.out.println(num1 + num2);
        break;
      }
      case  '-' :
      {
        System.out.println(num1 - num2);
        break;
      }
      case  '/' :
      {
        System.out.println(num1 / num2);
        break;
      }
      case  '*' :
      {
        System.out.println(num1 * num2);
        break;
      }
    
//    }
//  sc.close();
//   }
// }
