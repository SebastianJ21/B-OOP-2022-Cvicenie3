package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Locale;

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
        Main.sortStudents(poleStudentov,false);

        //Cvicenie

        int vek = KeyboardInput.readInt("Zadajte vek",2 );
        System.out.println(vek);


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

    public static void sortStudents(Student[] arr, boolean descending){

        if (descending){
            Arrays.sort(arr, Comparator.comparing(Student::getName).reversed());

        } else {
            Arrays.sort(arr, Comparator.comparing(Student::getName));
        }

}
    }
