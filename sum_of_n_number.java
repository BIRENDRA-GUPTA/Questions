import java.util.*;
class sum_of_n_number{
    public static void main(String[] args) {
        int sum = 0;
        Scanner biru = new Scanner(System.in);
         int num = biru.nextInt();
         for(int i=0; i<=num; i++ ){
            sum = sum+i;
         }
         System.out.println(sum);
    }
}