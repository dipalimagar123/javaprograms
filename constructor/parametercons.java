package constructor;
class demo2{
    int i;
    int j;
    demo2(int x, int y){
        i=x;
        y=j;
        System.out.println("constructor with args!!");

    }
    void add(){
        System.out.println(i+j);
    }
}

public class parametercons {
    public static void main(String[] args) {
        demo2 ob1=new demo2(50,50);
        demo2 ob2=new demo2(200, 400);
        ob1.add();
        ob2.add();

        
    }
    
}
