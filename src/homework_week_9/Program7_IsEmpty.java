package homework_week_9;

import java.util.ArrayList;

public class Program7_IsEmpty {
    public static void main(String[] args) {
        ArrayList<String> trainList = new ArrayList<String>();
        trainList.add("Bakeloo Line");
        trainList.add("Circle Line");
        trainList.add("Piccadilly Line");
        trainList.add("Northern Line");
        trainList.add("Jubilee Line");
        trainList.add("Metropolitan Line");
        if (trainList.isEmpty()) {
            System.out.println("Train-list is Empty");
        } else {
            System.out.println("Train-list is not Empty");
        }
        ArrayList<String> trainList_1 = new ArrayList<String>();
        if (trainList_1.isEmpty()) {
            System.out.println("Train-list_1 is Empty");
        } else {
            System.out.println("Train_list_1 is not Empty");
        }
    }
}
