import java.util.*;
public class ExceptionInteger {
    
    public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
      
       int a=0;
     try{
        a = sc.nextInt();
    }

    catch(InputMismatchException obj ){
      System.out.println(obj);
    }
 
    System.out.println(a);
}
   
}
