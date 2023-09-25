import java.util.Scanner;

public class count_digit_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
      // int n= 732;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println(count);
       
    }
}
