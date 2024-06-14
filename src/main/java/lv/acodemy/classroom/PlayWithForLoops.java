package lv.acodemy.classroom;

public class PlayWithForLoops {
    public static void main(String[] args) {

        //Print numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Print even numbers to 20

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        //calc sum of numbers 1-10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);


        //print elememts from array

        int[] numbers = {2, 34, 142, 222, 124, 152, 515};
        for (int number : numbers) {
            System.out.println(number);
        }

        //print numbers 10 to 1

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //print multiplication table with 5
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(String.format("%d*%d=%d", number, i, result));
        }


    }
}
