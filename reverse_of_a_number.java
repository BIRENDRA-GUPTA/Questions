import java.util.Scanner;

public class reverse_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rev =0;
        while(n>0){
            int rem =n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
        
    }
}
