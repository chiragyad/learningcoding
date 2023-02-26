import java.util.*;
public class linkedlist{
    public static void main(String []args){
        LinkedList l=new LinkedList();
        l.add("Java");
        l.add("Python");
        l.add("Cpp");
        l.add("C");
        l.add("PHP");

        System.out.println(l);
        ListIterator lit=l.listIterator();

        while(lit.hasNext()){
            String s=(String)lit.next();
            System.out.println(s);
            if(s=="Java"){
                lit.set("Java SE");

            }
            else if(s=="C"){
                lit.add("Data Structure");
            }
            else if(s=="PHP"){
                lit.remove();

            }
            
        }
    }
}