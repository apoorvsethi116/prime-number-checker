import java.util.*;

public class q1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for (int i = 1; i <= a; i++ ){
             b = a%i;
        }
        if ( b == 1 || b == 0){
            System.out.println(a +" is prime");
        }
        else{
            System.out.println("b is not a prime number");
        }
    
      

        }
    }

