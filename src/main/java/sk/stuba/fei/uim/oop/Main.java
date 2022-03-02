package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Comparator;

class Student{
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

public class Main {
    public static void main(String[] args) {

        //Uloha 1:
        Student sebike = new Student(10,"Sebi","Jakabcin",21);
        System.out.println(sebike.getAge());
        sebike.setName("Sebastian");
        System.out.println(sebike.getName());

        //Uloha 2:
        Student[] poleStudentov = new Student[6];
        Main.create5Students(poleStudentov);
        poleStudentov[5] = sebike;
        Main.sortStudents(poleStudentov,"descending");


    }

    public static void create5Students(Student[] arr){
        Student one = new Student(1,"Juraj","Andrasi",21);
        Student two = new Student(2,"Simona","Jancekova",19);
        Student three = new Student(3,"Tomas","Krason",25);
        Student four = new Student(4,"Andrej","Nejedlik",24);
        Student five = new Student(5,"Alexandra","Holikova",18);

        arr[0] = one;
        arr[1]= two;
        arr[2] = three;
        arr[3] = four;
        arr[4] = five;

    }

    public static void sortStudents(Student[] arr, String dirOfSort){
        Arrays.sort(arr, Comparator.comparing(Student::getName));
        int a =2;
    }

}
