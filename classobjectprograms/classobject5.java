import java.util.Scanner;
class student1{
    Scanner sc = new Scanner(System.in);
    String name;
    int roll_no;
    int sub1,sub2,sub3,sub4,sub5;

void getdata(){
    System.out.println("enter the student name");
    name=sc.next();
    System.out.println("enter the student roll number");
    roll_no=sc.nextInt();
    System.out.println("enter 1st subject mark  of student");
    sub1=sc.nextInt();
    System.out.println("enter the 2sub mark of student");
    sub2=sc.nextInt();
    System.out.println("enter the 3sub mark of student");
    sub3=sc.nextInt();
    System.out.println("enter the 4sub mark of of student");
    sub4=sc.nextInt();
    System.out.println("enter the 5sub mark of student");
    sub5=sc.nextInt();
}
  void show(){

    int total = sub1+sub2+sub3+sub4+sub5;
    float per=(total*100)/5;
    System.out.println("***************************");
    System.out.println("student name="+name);
    System.out.println("student roll_no="+roll_no);
    System.out.println("1st subject mark=+sub1");
    System.out.println("2nd subject mark=+sub2");
    System.out.println("total mark="+total);
    System.out.println("percentage="+per);
    System.out.println("*********************************************");

  }



}
    

