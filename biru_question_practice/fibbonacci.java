import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int n = biru.nextInt();
        int a = 0;
        int b =1;
        int c;
       for(int i = 0; i<n; i++){
        System.out.println(a);
        c= a + b;
        a = b;
        b = c;

       }
       biru.close();
    }
}
