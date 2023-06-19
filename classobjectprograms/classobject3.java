import java.util.Scanner;

class demo3{
    int i;
    int j;
    void setij(int x,int y){
        i=x;
        j=y;

    }
    void add(){
        System.out.println(i+j);

    }
 }
public class classobject3 {
        public static void main(String[] args){
            demo3 obj4=new demo3();
            obj4.setij(20, 40);
            demo3 obj5=new demo3();
            obj5.setij(40,50);
            obj4.add();
            obj5.add();

            
    
    
        }
    
}
