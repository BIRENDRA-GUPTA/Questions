import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = facto(n);
        System.out.println("Factorial of a number is "+fact);
        
    }
   static int facto(int n){
        if(n==1){
            return 1;
        }else{
            return n*facto(n-1);
        }
        
    }
}
