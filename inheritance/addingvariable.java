package inheritance;
import java.util.Scanner;


    class A1{
        int i;
        A1()
        {
            i=10;
            System.out.println("in A");
        }

    }
     class B1 extends A1
     {
        int j;
        B1()
        {
            j=20;
            System.out.println("in B");
        }
     
     void add()
     {
        System.out.println(i+j);
     }
    
}

    public class addingvariable {
        public static void main(String[] args) {
            B1 ob=new B1();
            ob.add();

        }

    }
            
        
