import java.util.Scanner;

public class print_digits_in_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        while(number>0){
            int rem = number%10;
            System.out.println(rem);
            number=number/10;
        }
    }
}
