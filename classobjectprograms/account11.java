import java.util.Scanner;



class Account{
    int id;
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);

    void CreatAccount(){
        System.out.println("enter id:");
        id=sc.nextInt();
        System.out.println("enter name:");
        name=sc.next();
        System.out.println("enter init balance:");
        balance=sc.nextInt();

    } 

    void deposit(){
        System.out.println("enter amount to deposit:");
        int amt=sc.nextInt();
        balance=balance+amt;

    }


    void withdraw(){
        System.out.println("enter  amount to withdraw:");
        int amt=sc.nextInt();
        balance=balance-amt;

    }


    void print(){
        System.out.println("**********************************");
        System.out.println("id"+id);
        System.out.println("name"+name);
        System.out.println("balance"+balance);


    }


    }
    


public class account11{
    public static void main(String[] args) {
        Account c1=new Account();
        c1.CreatAccount();
        Account c2=new Account();
        c2.CreatAccount();


        c2.deposit();
        c1.print();
        c2.print();

    }

}


    

