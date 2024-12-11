import java.util.*;
public class Exception1{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int num1 = sc.nextInt();

    System.out.println("Enter a number:");
    int num2 = sc.nextInt();

   int Ans = 0;

   try{
   
    Ans= num1/num2;

   }

   catch(ArithmeticException obj){
   
     System.out.println("catch block handles try exception" + obj);
    
   }

finally{
    System.out.println("");
}




}
}
