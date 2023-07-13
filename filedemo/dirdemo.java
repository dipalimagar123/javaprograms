package filedemo;
 import java.io.*;
import java.util.Scanner;
 class dirdemo {
    public static void main(String[] args)throws Exception{
        String  dirpath,exten;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a dir name");
        dirpath = sc.nextLine(); 
        System.out.println("accept extensation"); 
         exten = sc.next();
        File f1 = new File(dirpath);
        if(f1.isDirectory()){

         String  str[] = f1.list();
         for(String s:str ){ 
         File f2 = new  File(s,dirpath);
         if((f2.isFile()) && (s.endsWith(exten))) {
            System.out.println(s + "  is a file");

         }else{
         System.out.println(s + "not txt file");
        
         }

        }
    }else
    System.out.println(dirpath+" is not a directory");
}

}
    
    




    


    

    


        


    

    
    

