import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        //array decalration
        int arr[] = new int[size];
        int arr1[]={10,290};
       
        for(int i=0;i<size;i++){
            arr[i] = scn.nextInt();//this line is taking input from keyboard
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//this line is showing output
        }

    }
}
