import java.util.*;

class AgeInvallid extends Exception {
    public AgeInvallid(String str){
        super(str);
    }
    
}

class UserDefined{

    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age:");
int Age = sc.nextInt();

try{
    if(Age < 18){
        AgeInvallid aobj = new AgeInvallid("Your age is below 18");
     throw aobj;
     
    }
    else{
 System.out.println("Login Successfully");
    }
}
catch(AgeInvallid obj){
    System.out.println("Inside catch block");
    System.out.println(obj);
}

    }
}
