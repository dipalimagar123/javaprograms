import java.util.Scanner;

class employee{
    int id;
    String name;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter a name");
        name=sc.next();

    }
    void display(){
        System.out.println("id is="+id);
        System.out.println("name is="+name);


        }
    }
    class manager extends employee{
        int salary;
        void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter salary");
            salary=sc.nextInt();
        }
        void display(){
            System.out.println("salary is="+salary);
        }
    }
    public class classobject10{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int i,choice;
            employee ref[] =new employee[5];
            for(i=0;i<5;i++){
                System.out.println("enter your choice(1/2)");
                choice=sc.nextInt();
                if(choice==1){
                    ref[i]=new employee();
                    ref[i].getdata();

                }
                else{
                    ref[i]=new manager();
                    ref[i].getdata();

                }
            }

            for(i=0;i<5;i++){
                if(ref[i].getClass().getName().equals("employee"))
                {
                    System.out.println("employee object");
                }
                else{
                    System.out.println("manager object");
                    ref[i].display();
                }
            }
        }
    }
