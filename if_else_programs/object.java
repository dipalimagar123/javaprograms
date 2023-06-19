import java.util.Scanner;
class demo4{
    int classyear;
    String firstname,lastname;
    Scanner sc=new Scanner(System.in);

    void  year(){
        System.out.println("enter class year");
        classyear=sc.nextInt();

    }
    void first(){
        System.out.println("enter first name");
        firstname=sc.next();
    }
    void last(){
        System.out.println("enter last name");
        lastname=sc.next();
    }
    void show(){
        System.out.println(classyear);
        System.out.println(firstname);
        System.out.println(lastname);
    }
}

public class object {
    public static void main(String[] args) {
        demo4 ob1=new demo4();
        ob1.year();
        ob1.first();
        ob1.last();
        ob1.show();
            
        
        
    }
    
}
