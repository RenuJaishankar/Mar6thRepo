package Lesson;

public class Dog {
    private String name;
    private int  age;
    //since this variableis public,you don't need getters and setters to access it
    public static int amountOfDogs=0;
//constructios does not have return type
    public Dog(String name, int age) {
     //the "this" keyword refers to the object of the current class
     //in Java, it is  most often seen inside of constructors.
        this.name = name;
        this.age = age;
        amountOfDogs++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setAmountOfDogs(int amountOfDogs) {
        Dog.amountOfDogs = amountOfDogs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getAmountOfDogs() {
        return amountOfDogs;
    }
}
