import java.util.Scanner;

public class sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
int sum=0;
        while(n>0){
            int rem = n%10;
        
            sum = sum+rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
