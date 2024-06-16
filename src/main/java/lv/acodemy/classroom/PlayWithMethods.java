package lv.acodemy.classroom;

public class PlayWithMethods {
    public static void main(String[] args) {
        greeting("Arturs");
        var x = add(10, 20);
        System.out.println(x);
        System.out.println(add(10, 12));

        //check if number is even
        System.out.println(isEven(10));
        System.out.println(findMax(234646, 346363));

        //check if word is palindrome
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("acodemy"));

    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        //return number % 2 == 0
        return number % 2 == 0;
    }

    public static int findMax(int number1, int number2) {
        //return Math.max(number1, number2)
        //simplified if else
        return (number1 >= number2) ? number1 : number2;
    }
    //Palindrome (civic, kayak, rotator, tenet, repaper)

    public static boolean isPalindrome(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }
        return word.equals(reversedWord);
    }
}
