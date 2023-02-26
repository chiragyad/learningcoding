import java.util.*;
public class name{
    public static void main(String []args){
        Vector v=new Vector();
        v.addElement("One");
        v.addElement("Two");
        v.addElement("Three");
        v.addElement("Four");
        System.out.println(v);

        Enumeration e=v.elements();

        while(e.hasMoreElements()){
            String s=(String)e.nextElement();
            System.out.println(s+" "+s.length());
        }
    }
}