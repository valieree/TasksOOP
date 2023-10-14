package vsu.course2.task5;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Passport p1 = new Passport("2018", "123456");
        Passport p2 = new Passport("2018", "123456");
        Passport p3 = new Passport("2011", "654321");
        Passport p4 = new Passport("2023", "123123");
        Passport p5 = p1;
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        System.out.println(p1==p5);

        System.out.println("------");

        System.out.println(p1.equals(p5));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));

        System.out.println("------");

        System.out.println(p1.hashCode()==p2.hashCode());
        System.out.println(p1.hashCode()==p3.hashCode());

        System.out.println("------");

        StudentChange st1 = new StudentChange(1, "Sofia", List.of(5, 5, 3, 4));
        StudentChange st2 = new StudentChange(1, "Sofia", List.of(5, 5, 3, 4));
        System.out.println(st2.equals(st1));
        System.out.println(st1 == st2);
        System.out.println(st2.hashCode() == st1.hashCode());

        System.out.println("------");

        StudentWithPassport st1p = new StudentWithPassport(new Passport("123456", "2018"), 1);
        StudentWithPassport st2p = new StudentWithPassport(new Passport("123456", "2018"), 1);

        System.out.println(st1p.equals(st2p));
        System.out.println(st1p == st2p);
        System.out.println(st1p.hashCode() == st2p.hashCode());

        System.out.println("-------");

        Student stud1 = new Student(1, "Petya");
        Student stud2 = new Student(2, "Petya");

        System.out.println(stud1.equals(stud2));
        System.out.println(stud1 == stud2);
        System.out.println(stud1.hashCode() == stud2.hashCode());
    }
}
