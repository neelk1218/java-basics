//exaple:- Comapring 4 numbers
import java.util.Scanner;
public class ifElseIf{
  public static void main(String[]args){
    int a = 8;
    int b = 21;
    int c = 3;
    int d = 20;

    

    if(a>b && a>c && a>d)
     {
      System.out.print(a);

     }
    else if(b >c && b>d)
     {
      System.out.print(b);
    
     } 
    else if(c>d)
    {
      System.out.print(c);
    }
    else
    {
      System.out.print(d);
    }
  }
}
