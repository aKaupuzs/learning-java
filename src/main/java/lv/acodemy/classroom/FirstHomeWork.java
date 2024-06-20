package lv.acodemy.classroom;

public class FirstHomeWork {
    public static void main(String[] args) {


        //Easy peasy: Write a Java program that checks if a given number is positive. If it is, print "Positive number."
        int i = 12;
        if (i > 0) {
            System.out.println("Positive number.");
        } else {
            System.out.println("Not a positive number.");
        }
        //Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."
        int even = 124121;
        if (even % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        //Age group classifier: Write a Java program that classifies a person into different age groups based on their age. If the age is less than 18, print "Teenager," otherwise print "Adult."
        int age = 18;
        if (age <= 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
        //Leap year checker: Create a Java program that checks if a given year is a leap year. If it is, print "Leap year."
        int year = 1997;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }


        //Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100. If all conditions are true, print "Valid number."
        int validNumber = 99;
        if (validNumber > 0 && validNumber % 2 == 0 && validNumber < 100) {
            System.out.println("Valid number");
        } else {
            System.out.println("invalid number");
        }
        //Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even. If both conditions are true, print "Positive and Even."
        int nest = 988;
        if (nest > 0) {
            if (nest % 2 == 0) {
                System.out.println("Positive and even");
            } else {
                System.out.println("Invalid number");
            }
        }
        //Character type identifier: Write a Java program that determines if a given character is a vowel. If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)
        char vowel = 'b';
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
                vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges. Print the category based on the BMI. Formula: bmi = weight / (height * height);
        double height = 1.86; //in meters
        double weight = 87; //in kilogramms
        double bmi = weight / (height * height);
        if (bmi <= 18.5) {
            System.out.println("Your BMI is: " + bmi + " and you are UNDERWEIGHT");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Your BMI is: " + bmi + " and you are IN HEALTHY RANGE");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Your BMI is: " + bmi + " and you are OVERWEIGHT");
        } else if (bmi >= 30 && bmi <= 40) {
            System.out.println("Your BMI is: " + bmi + " and you are OBESIVE");
        } else if (bmi > 40) {
            System.out.println("Your BMI is: " + bmi + " and you are SEVERELY OBESIVE");
        }


    /*
    Write a Java program that calculates the final grade for a student based on their scores in three subjects: Math, Science, and English. The program should take input scores for each subject and calculate the average. Assign a final grade based on the following criteria:
    If the average score is 90 or above, assign a grade of "A."
    If the average score is between 80 and 89, assign a grade of "B."
    If the average score is between 70 and 79, assign a grade of "C."
    If the average score is between 60 and 69, assign a grade of "D."
    If the average score is below 60, assign a grade of "F."
     */

        int math = 81;
        int science = 98;
        int english = 76;
        double average = (math + science + english) / 3.0;
        if (average >= 90) {
            System.out.println("You got A");
        } else if (average < 89 & average > 80) {
            System.out.println("You got B");
        } else if (average < 79 & average > 70) {
            System.out.println("You got C");
        } else if (average < 69 & average > 60) {
            System.out.println("You got D");
        } else if (average < 60) {
            System.out.println("You got F");
        } else {
            System.out.println("N/A");
        }
        //File extension checker: Write a Java program that takes a filename as input and checks if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf". If the file has a valid extension, print "Valid file extension," otherwise print "Invalid file extension."

        String doc = "text.jpeg";
        boolean s = doc.endsWith(".txt") || doc.endsWith(".doc") || doc.endsWith(".pdf");
        if (s) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }

    }
}

