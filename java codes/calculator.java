import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
/*if (a == b){
    System.out.println("equal");

} 
if (a>b){
    System.out.println("a is greater than b "); 
}
if (a<b){
    System.out.println("a is lesser than b");
}
else {
    System.out.println();
} */
switch (button){
    case 1 : System.out.println(a+b);
    break;
    case 2 : System.out.println(a*b);
    break;
    case 3 : System.out.println(a/b);
    break;
    case 4 : System.out.println(a%b);
    break;
    case 5 : System.out.println((a+b)/2);
    break; 
    default: System.out.println("error");

}  
}
}

