import java.util.*;
public class arraylist{
    public static void main(String []args){
        ArrayList list=new ArrayList();
        list.add("Sohan");
        list.add("Rohan");
        list.add("Mohan");
        list.add("Munna");
        System.out.println(list);


        Iterator it=list.iterator();

        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s+" "+s.length());
            if(s=="Munna"){
                it.remove();
            }
            System.out.println(s+" "+s.length());
        }
    }
}