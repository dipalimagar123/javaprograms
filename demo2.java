import java.io.*;
import java.io.FilterOutputStream;
public class demo2 {
    public static void main(String[] args) {


        //create  object of fileinputstream
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\abc\\Desktop\\dipali\\text2.txt");
        int x;
        do{
            x=fin.read();
            if(x!=-1){
                fin.write(x);
            
        }
         while(x!=-1);
         fin.close();
         System.out.println("file copied");
            

        }
        
    }
    

