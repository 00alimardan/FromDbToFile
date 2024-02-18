package Exercise;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Person mother;
    private Person father;


    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(int id, String name, String surname, int age, Person mother, Person father) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", mother=Person{"+"name='" + mother.getName() + '\'' + ", surname='" + mother.getSurname() + '\'' +"}"+
                ", father=Person{"+"name='" + father.getName() + '\'' + ", surname='" + father.getSurname() + '\'' +"}"+
                "}\n";
    }
}

