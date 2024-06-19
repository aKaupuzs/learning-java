package lv.acodemy.classroom;

public class Cat {
    private String breed;
    private String name;
    private int age;
    private String color;


    public Cat(String breed, String name, int age, String color) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        ;
        this.color = color;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice() {
        System.out.println("MEOW!");
    }

    public void eat() {
        System.out.println("NOMNOM");
    }

    public void sleep() {
        System.out.println("PURRR");
    }

    public void walk() {
        System.out.println("PURRRRRR");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
