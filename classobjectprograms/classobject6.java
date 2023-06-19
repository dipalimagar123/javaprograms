import java.util.Scanner;
class demo1{
    String name;
    int balance;
    Scanner sc = new Scanner(System.in);
    void name(){
        System.out.println("enter full name of customer");
        name=sc.next();
    }
    void balance(){
        System.out.println("enter the customer balance");
        balance=sc.nextInt();

    }
    void show(){
    System.out.println(name);
    System.out.println(balance);

   }


}
 public class classobject6{
    public static void main(String[] args){
        demo1  ob2=new demo1();
        demo1  ob3=new demo1();
        ob2.name();
        ob2.balance();
        ob3.name();
        ob3.balance();
        ob2.show();
        ob3.show();

       


    }
    
}


    

