package sk.stuba.fei.uim.oop;

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
        Student sebike = new Student(10,"Sebi","Jakabcin",21);
        System.out.println(sebike.getAge());
        sebike.setName("Sebastian");
        System.out.println(sebike.getName());


    }

}
