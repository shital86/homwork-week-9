public class Program3_ReverseAnArray {
    public static void main(String[] args) {
        int[]number = new int[]{10,20,30,40,50,60,70};
        System.out.println("The Original Array is: ");
        for (int i=0; i<number.length;i++){
            System.out.println(number[i] +" ");

        }
        System.out.println();
        System.out.println("The Reversed Array is: ");
        for ( int i=number.length-1;i>=0;i--){
            System.out.println(number[i] +" ");
        }

    }
}
