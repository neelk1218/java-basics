// import java.util.Scanner;

public class gradeAllocation{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //TAKING USER INPUT
    System.out.print("Enter your Marks : ");
    int grades = sc.nextInt();

   if(grades>=90){
    System.out.println("A GRADE");
   }
   else if(grades>=75){
    System.out.println("B GARDE");
   }
   else if(grades>=60){
    System.out.println("c GARDE");
   }
   else{
    System.out.println("Failed");
   }
   sc.close();
  }
}
