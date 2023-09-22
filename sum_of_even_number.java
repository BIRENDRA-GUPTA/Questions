import java.util.*;
public class sum_of_even_number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner biru = new Scanner(System.in);
        int num=biru.nextInt();
        for(int i=0; i<num; i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
