package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculator calculator= new Calculator();
        char result;

        do {
            System.out.print("Enter first Number : ");
            int num1 = input.nextInt();
            System.out.print("Enter second Number : "+"(cannot be zero for Division)");
            int num2 = input.nextInt();
            System.out.print("Please enter one of symbol +, -, *, / : ");
            char symbol = input.next().charAt(0);
            calculator.calculateResult(num1, num2, symbol);
            System.out.println(" ");
            System.out.print("Would you like to do more calculation, Please enter 'Y' or 'N' :  ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y');


    }

}
