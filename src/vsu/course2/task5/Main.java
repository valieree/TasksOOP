package vsu.course2.task5;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Passport p1 = new Passport(34214, 1456);
        Passport p2 = new Passport(34214, 1456);
        Passport p3 = new Passport(34214, 1446);
        Passport p4 = new Passport(3, 1456);
        Passport p5 = p1;
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1==p5);
        System.out.println(p1.equals(p5));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println("__________");
        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p1.hashCode()==p3.hashCode());
        System.out.println("__________");
        StudentChange vasya = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
        StudentChange vasya2 = new StudentChange(1, "Vasya", List.of(2, 3, 3, 4));
        System.out.println(vasya2.equals(vasya));
        System.out.println(vasya2 == vasya);
        System.out.println(vasya2.hashCode() == vasya.hashCode());
        System.out.println("__________");
        StudentWithPassport vasya1 = new StudentWithPassport(new Passport(34214, 1456), 1);
        StudentWithPassport vasya12 = new StudentWithPassport(new Passport(34214, 1456), 1);
        System.out.println(vasya12.equals(vasya1));
        System.out.println(vasya12 == vasya1);
        System.out.println(vasya12.hashCode() == vasya2.hashCode());
        System.out.println("__________");
        Student stud1 = new Student(1, "stud1");
        Student stud2 = new Student(2, "stud1");
        System.out.println(stud1.equals(stud2));
        System.out.println(stud1 == stud2);
        System.out.println(stud1.hashCode() == stud2.hashCode());
    }
}
