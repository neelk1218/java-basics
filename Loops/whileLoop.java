//LOOPS
//WHILE LOOP 
public class Main{
  public static void main(String[]args){
   
    int i = 1 ;

    while(i<=5){
      System.out.println("HELLO WOLRD" + i );
      i++;
    }
    
  }
}

//NESTED WHILE LOOP 
public class whileLoop{
  public static void main(String[]args){
    int i = 1;

    while(i<=5){
      System.out.println("Good Morning" + i);

      int j =1;
      while(j<=5){
        System.out.println("Hello World" + j);
        j++;
      }
      i++;

    }
  }
}

