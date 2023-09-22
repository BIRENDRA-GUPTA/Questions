import java.util.Scanner;

public class positive_neg_zero{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==0){
            System.out.println("GIVEN NUMBER IS ZERO");
        }else if(n<0){
System.out.println("GIVEN NUMBER IS NEGATIVE");
        }else{
            System.out.println("GIVEN NUMBER IS POSITIVE");
        }
    }
}