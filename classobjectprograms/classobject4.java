import java.util.Scanner;
class student{
    int id;
    String name,Stream;
    Scanner sc=new Scanner(System.in);
    student(){
        System.out.println("enter student id");
        id=sc.nextInt();
        System.out.println("enter a name");
        name=sc.next();
    }
}
class graduation extends student{
    graduation(){
        System.out.println("enter student stream");
        Stream=sc.next();
    }
    void display(){
        System.out.println("student id="+id);
        System.out.println("student name="+name);
        System.out.println("student stream="+Stream);
    }

}
public class classobject4 {
    public static void main(String[] args){
        graduation ob6=new graduation();
        ob6.display();
    }
    
}
