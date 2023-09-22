import java.util.*;
public class print_all_prime_number {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int low = biru.nextInt();
        int high = biru.nextInt();

        for (int n = low; n<=high; n++){
            int count = 0;
            for (int div = 2; div*div <= n; div++){
                if(n % div == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(n);
        }
    }
    biru.close();
}
}
