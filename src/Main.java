import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Primitives
        int number = 10;
        System.out.println("number: " + number);

        double price = 9.99;
        System.out.println("price: " + price);

        char grade = 'A';
        System.out.println("grade: " + grade);

        boolean isJavaFun = true;
        System.out.println("isJavaFun: " + isJavaFun);

        // Non-Primitive Data Types
        String greeting = "Hello";

        System.out.println("greeting: " + greeting);


        int numbers_size = 10;
        int[] numbers = new int[numbers_size];

        int i = 0;

        while (i < numbers_size) {
            numbers[i] = i;
            i++;
        }

        System.out.println("numbers: " + Arrays.toString(numbers));


    }
}