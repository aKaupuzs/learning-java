package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Arturs";
        String lastName = "Kaupuzs";

        //My name is Arturs Kaupuzs

        String myText = "My name is: " + name + " " + lastName;
        System.out.println(myText);

        // Interpolation
        //%s for text
        //%d for numberic values
        String interpolation = String.format("My name is: %s %s", name, lastName);
        System.out.println(interpolation);
        System.out.printf(String.format("My name is: %s %s", name, lastName));

        //Classroom assignment

        String firstName = "Arturs";
        String surName = "Kaupuzs";
        int age = 27;
        String city = "Riga";


        String myText2 = name + " " + surName;
        System.out.println(myText2);

        String concatenation = firstName + " " + surName + " is " + age + " years old and lives in " + city;
        System.out.println(concatenation);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));
    }
}
