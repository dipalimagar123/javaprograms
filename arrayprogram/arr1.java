package arrprogram;
import java.util.Scanner;
public class arr1 {

    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("enter array");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("your array:");
        for(i=0;i<5;i++){
        System.out.println(arr[i]);
        }
    }
}