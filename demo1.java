import java.io.*;
public class demo1 {
    public static void main(String[] args)throws Exception { 
         
        // create object of fileInputstream

        byte[] arr = new byte[100];
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\abc\\Desktop\\dipali\\test2.txt");

        int x;
        do{
            x = fin.read(arr);
            if(x!=-1);
            String s1=new String(arr);
            System.out.println(s1);
        }
         while(x!=-1);
         fin.close();


    }

}


        
    
    

