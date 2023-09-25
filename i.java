import java.util.*;
public class i {
    public static void main(String[] args) {
        Scanner biru = new Scanner(System.in);
        int size = biru.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <size; i++ ){
            arr[i] = biru.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
