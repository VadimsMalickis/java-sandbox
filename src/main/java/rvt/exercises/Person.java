package rvt.exercises;

import rvt.utils.SimpleDate;

public class Person {
    private String name;
    private int age;
    private SimpleDate birthday;
    private double weight;
    private double height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public void growOlder() {
        this.age = this.age + 1;
    }
    
    public void growOlder(int years) {
        this.age = this.age + years;
    }

    public boolean olderThan(Person compared) {
        return this.birthday.before(compared.getBirthday());
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public double bodyMassIndex() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Person)) {
            return false;
        }

        // convert the object into a Person object
        Person comparedPerson = (Person) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedPerson.name) &&
            this.age == comparedPerson.age &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
