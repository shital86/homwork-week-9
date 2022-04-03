package homework_week_9;

import java.util.HashMap;
import java.util.Map;

public class Program9_Map {public static void main(String[] args) {
    //declare map

    Map<Integer,String> list =new HashMap();
    list.put(1,"Red");
    list.put(2,"Yellow");
    list.put(3,"White");
    list.put(4,"Blue");
    for (Map.Entry<Integer,String> colourList:list.entrySet()){
        //  System.out.println(carName.getKey()+ " , " +carName.getValue());
        System.out.println(colourList);
    }

}

}
