package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Locale;

public class Student{
    private int  ID;
    private String name;
    private String surname;
    private int age;

    public Student(int ID, String name , String surname, int age){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
