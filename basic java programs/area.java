
import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, r;
        System.out.println("enter the radius of circle");
        r = sc.nextFloat();
        a = 3.14f * r * r;
        System.out.println("area is" +a);

    }

}
