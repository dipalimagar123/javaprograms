

class test4{
    void add(int x,int y){
        System.out.println("int add function called!!");
        System.out.println(x+y);
    }
    
    void add(float x, float y){
        System.out.println("float add functin called!!");
        System.out.println(x+y);

    }
}

public class classobject7{
    public static void main(String[] args) {
        
    
    test4 ob=new test4();
    ob.add(1.2F,2.3F);
    ob.add(100,200);
}
} 

 


