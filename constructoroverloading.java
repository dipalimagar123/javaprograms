package constructor;
class demo1{
    int i;
    int j;
    demo1(int x,int y){
        i=x;
        j=y;
        System.out.println("constructor with arg called!!");
    }
    demo1(){
        i=100;
        j=200;
        System.out.println("constructor without args called!!");

    }
    void add(){
        System.out.println(i+j);
    
    

    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        demo1 ob1=new demo1();
        demo1 ob2=new demo1(40,50);
        ob1.add();;
        ob2.add();

    }

}


        
    
    

