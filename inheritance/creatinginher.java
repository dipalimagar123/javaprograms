package inheritance;
import java.util.Scanner;
class a{
    void show(){
        System.out.println("in A");
    }

}
class b extends a{

    void disp(){
        System.out.println("in B");
    }
}



public class creatinginher {
    public static void main(String[] args) {
        b ob=new b();
        ob.show();
        ob.disp();
    }
} 

