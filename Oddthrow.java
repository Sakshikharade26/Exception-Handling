import java .util.*;

 class NumberDetect extends Exception {
    public NumberDetect(String str){
        super(str);
    }

    
}

class Oddthrow{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();

        try{
            if(num % 2 != 0){
                NumberDetect nobj = new NumberDetect("Your number is detected");
                throw nobj;

            }
            else{
                System.out.println("Your number is not detected");
            }
        }
        catch(NumberDetect obj){
            System.out.println(obj);
        }
    }
}
