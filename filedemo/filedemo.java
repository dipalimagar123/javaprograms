package filedemo;
import java.io.*;


public class filedemo {
    public static void main(String[] args) throws Exception {
       File f1 = new File("C:\\Users\\abc\\Desktop\\renuka");  
       System.out.println("name"+ f1.getName());
       System.out.println("parent" +f1.getParent());
       System.out.println("absolute" + f1.getAbsolutePath());
       System.out.println("cononical" +f1.getCanonicalPath());
       System.out.println("path"  +f1.getPath());
       System.out.println("modify" +f1.lastModified());
       System.out.println("size of file " +f1.length());
       System.out.println("exitsts" +f1.exists());
       System.out.println("can i write" +f1.canWrite());
       System.out.println("read" +f1.canRead());
       System.out.println("file" +f1.isFile());
       System.out.println("directory" +f1.isDirectory());
       System.out.println("hidden" +f1.isHidden());
       System.out.println("mkdir" +f1.mkdir());
       System.out.println("mkdirs" +f1.mkdirs());
       System.out.println("list" +f1.list());
       System.out.println("listfile" +f1.listFiles());
      

}  
    

}   
    

