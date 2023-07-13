
import java.io.*;
class Demo{
        public static void main(String[] args)throws Exception {

        // create object of the fileInputstream

        FileInputStream fin;
        fin = new  FileInputStream("C:\\Users\\abc\\Desktop\\dipali\\test2.txt");
         int x;
         do{

            x = fin.read();
            System.out.println((char)x);

         }
           while(x!=-1);
           fin.close();

    }
}