package lv.acodemy.classroom;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {

        //Arrays

        //Declaring array

        int[] numbers;
        numbers = new int[10];
        // int[] numbers = new int [18]

        System.out.println(Arrays.toString(numbers));

        numbers[1] = 2;
        numbers[3] = 4;
        numbers[5] = 6;
        numbers[7] = 8;
        numbers[9] = 10;

        System.out.println(Arrays.toString(numbers));

        int[] evenNumbers = {2, 4, 6, 8, 10, 12};


        String[] names = {"John", "Michael", "Anna", "Maria"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        String[] fruits = {"Apple", "Kiwi", "Papaya", "Melon", "Carambola"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);

    }
}
