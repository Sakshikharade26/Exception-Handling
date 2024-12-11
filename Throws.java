import java.util.*;

 class Demo {
    public void Division() throws ArithmeticException{
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");
    int num1 = sc.nextInt();

    System.out.println("Enter the number:");
    int num2 = sc.nextInt();

    int Ans = 0;
    Ans= num1/num2;

    System.out.println("Division is: "+Ans);
    }

}

class Throws{

    public static void main(String args[]){
 Demo dobj = new Demo();

 try{
    System.out.println("Inside try block");
 dobj.Division();

}

catch(ArithmeticException obj){
    System.out.println("Inside catch block");

}
finally{
    System.out.println("Inside finally ");
}

    }
}
