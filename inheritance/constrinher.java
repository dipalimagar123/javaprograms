package inheritance;
import java.util.Scanner;
class A{
    A()
    {
        System.out.println("in A");
    }
}
class B extends A{
    B()
    {
        System.out.println("in B");
    }

}
class c extends B{
    c()
    {
        System.out.println("in C");
    }
}


public class constrinher {
    public static void main(String[] args) {
        C ob=new C();


        
    }
    
}
