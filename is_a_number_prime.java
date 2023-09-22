import java.util.Scanner;

public class is_a_number_prime {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int t = biru.nextInt();
        
        for(int i =0; i<t; i++);{
        int n = biru.nextInt();

        int count = 0;
        for(int div = 2; div * div <= n; div++){
            if(n % div == 0){
            count++;
            break;
        }
    }
    if(count == 0){
        System.out.println("prime");
    }else {
        System.out.println("not prime");
    }
    biru.close();
    }
}
}
