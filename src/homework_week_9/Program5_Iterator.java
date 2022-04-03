package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5_Iterator {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<String>();
        list.add("Happy");
        list.add("Joy");
        list.add("Cheerful");
        list.add("Glad");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String list1 =(String) iterator.next();
            System.out.println(list1);
        }

        Iterator<String>iterator= list.iterator();
        while (iterator.hasNext()){
            String list1 =(String) iterator.next();
            System.out.println(list1);
        }
        }
            
        }





