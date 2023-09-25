import java.util.Scanner;

public class factorail {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();

        // this approch done with while loop

    //     int fact = facto(n);
    //     System.out.println("factorial of a "+ fact);
    // }
    // static int facto(int n){
    //     if(n==1){
    //         return 1;
    //     }else{
    //         return n*facto(n-1);
    //     }

    // another approch of for loop

    int fact = 1;
    for (int i = 1; i<=n; i++){
        fact = fact*i;
    }
    System.out.println(fact);
    }
}
