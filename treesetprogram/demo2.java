

import java.util.ArrayList;
public class demo2{

    public static void main(String[] args) {

        ArrayList <student> ob = new ArrayList<>();
        student st1 = new student(100, "rupali");
        student st2 = new student(200, "mayu");
        student st3 = new student(200, "samu");
        student st4 = new student(200, "srushti");

        ob.add(st1);
        ob.add(st2);
        ob.add(st3);
        ob.add(st4);

    

        // show all student

        for(student st:ob){
            System.out.println(st.getId() + "  " + st.getName());

        }//search
        int id = 800;
        boolean  f = false;
        for(student st:ob){
            if(st.getId() == id){
            f = true;
            break;   

            }
        }
        if(f==true){
            System.out.println("found object");
        }else{
            System.out.println("object not found");
        
        }
       

    // delete
    id=800;
    for(student st: ob){
        if(st.getId()==id){
            ob.remove(st);
            break;
        }
    }


     System.out.println("after deletion");
     for (student st : ob){
        System.out.println(st.getId()+  "" +st.getName());

     }

    }

}


    





    

