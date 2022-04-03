package homework_week_9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program8_HashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

       set.add(1);
       set.add(2);
       set.add(3);
       set.add(4);
       set.add(5);
       set.add(6);
       set.add(7);
       set.add(8);
       set.add(9);
       set.add(10);



        //Iterate set using iterator interface
        Iterator itr= set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


