import java.util.Scanner;

public class count_the_digit {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();

        int count = 0;

        while(n>0){
            count ++;
            n = n/10;
        }
        System.out.println(count);
        biru.close();
    }
}
