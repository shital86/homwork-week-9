package calculate;


public class Calculator {
    int a;
    int b;
    char ch;
   public void addition(int a,int b){

        System.out.println("sum = " +(a+b));

    }
   public void subtraction(int a,int b){

        System.out.println("subtract" + (a-b));


    }
  public  void division(int a,int b){

        System.out.println("Division" + (a / b));

    }
   public void multiplication(int a,int b){
      System.out.println("Multiplication" + (a * b));

    }
  public  void calculateResult(int a,int b,char symbol){
      if (symbol == '+') {
          addition(a, b);
      } else if (symbol == '-') {
          subtraction(a, b);
      } else if (symbol == '/') {
          division(a, b);
      } else if (symbol == '*') {
          multiplication(a, b);
      } else {
          System.out.println("Invalid Symbol");
      }


    }
}
