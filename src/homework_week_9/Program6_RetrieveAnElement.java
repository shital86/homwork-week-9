package homework_week_9;

import java.util.ArrayList;

public class Program6_RetrieveAnElement {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>();
       number.add(23);
       number.add(34);
       number.add(99);
       number.add(65);
       number.add(90);
        System.out.println(number);
        Integer element = number.get(4);
        System.out.println("Specific index number :" +element);
    }
}
