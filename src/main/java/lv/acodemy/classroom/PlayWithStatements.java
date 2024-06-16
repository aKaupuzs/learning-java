package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {

        int a = 10;
        if (a > 5) {
            System.out.println("This is true!");
        }
        int y = 8;
        if (y % 2 == 0) {
            System.out.println("y is even number");
        }
        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }
        if (b != y) {
            System.out.println("b is not equal to y");
        }
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to swim");
        }

        //if-else!!!!!!!!!

        int z = -10;
        if (z >= 0) {
            System.out.println("Z is a positive number");
        } else {
            System.out.println("Z is a negative number");
        }

        String name = "Ann";
        if (name.equals("John")) {
            System.out.println("Variable contains name John");
        } else {
            System.out.println("Variable contains name " + name);
        }

        // IF-ELSE-IF-ELSE

        int e = 2;
        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal to 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        int[] numbers = {-5, 1, 25, 0, -1, 4, 0, -235};

        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number: %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number: %d is negative number\n", number);
            } else {
                System.out.printf("Number: %d is equal to 0\n", number);
            }
        }

        int[] grades = {1, 54, 32, 64, 89, 93, 45, 77};

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade %d is Excellent \n", grade);
            } else if (grade >= 75 && grade < 90) {
                System.out.printf("Grade %d is Good \n", grade);
            } else if (grade >= 50 && grade < 75) {
                System.out.printf("Grade %d is OK \n", grade);
            } else if (grade >= 0 && grade < 50) {
                System.out.printf("Grade %d is NOK \n", grade);
            } else {
                System.out.printf("Grade %d is UNKNOWN \n", grade);
            }
        }

        int[] temps = {-11, 4, 12, 24, 39, 13, -5, 0};

        for (int temp : temps) {
            if (temp < -10) {
                System.out.printf("Temperature %d is Freezing \n", temp);
            } else if (temp < 0 && temp >= -10) {
                System.out.printf("Temperature %d is Cold \n", temp);
            } else if (temp >= 0 && temp < 10) {
                System.out.printf("Temperature %d is Chill \n", temp);
            } else if (temp >= 10 && temp < 20) {
                System.out.printf("Temperature %d is Mild \n", temp);
            } else if (temp >= 20 && temp < 30) {
                System.out.printf("Temperature %d is Warm \n", temp);
            } else if (temp >= 30) {
                System.out.printf("Temperature %d is HOT \n", temp);
            } else {
                System.out.printf("Temperature %d is UNKNOWN \n", temp);
            }
        }
    }
}
