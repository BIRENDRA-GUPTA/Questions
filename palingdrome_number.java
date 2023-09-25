import java.util.Scanner;

public class palingdrome_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Given number is an palingdrome number");
        }else{
            System.out.println("Given number is not an palingdrome number");
        }
    }
}
