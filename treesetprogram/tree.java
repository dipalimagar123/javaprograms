package treemap;



public class student {
   private int id;
   private String name;
   public student(int id,String name){
 super();
   this.id=id;
   this.name=name;

   }

   


   public int getId() {
       return id;
   }
   
   
   public String getName() {
       return name;
   }
}


public class tree {
public static void main(String[] args) {
   Treemap <Integer,String> ob=new Treemap<>();
    ob.put(4, "abc1");
    ob.put(2, "abc2");
    ob.put(1, "abc3");
    ob.put(5, "abc4");
    System.out.println(ob);
}


//     Set<Integer> mkyes = ob.keyset();
//     System.out.println("all keys");
//     for(Integer k:mkyes){
//        System.out.println(k);
//     }

//    System.out.println("all values");
//     Collection <String>mvalues = ob.values();
//     for(Integer s:mvalues){
//         System.out.println(s);
//     }
//    System.out.println("all items");
//     Set<Entry<Integer,String>> items = ob.Enterset();
//    for(Entry<Integer,String>Entry:items){
//        System.out.println(Entry.getkey() + " " + Entry.getvalue);
   }
}

}
    


    

