import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();
       // for(int i = 0; i < n; i++){
            if (n % 2 == 0){
                System.out.println("even number" + n);
            } else{
                System.out.println("odd number");
            }
        }
    }
//}
