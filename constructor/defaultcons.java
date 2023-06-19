package constructor;

class demo{
    int i;
    int j;
    demo(){
    i=10;
    j=20;
    System.out.println(" constructor withot args called!!");
}
void add(){
    System.out.println(i+j);
}

}



public class defaultcons {
    public static void main(String[] args) {
        demo ob1=new demo();
demo ob2=new demo();
        ob1.add();
        ob2.add();
    }
}


