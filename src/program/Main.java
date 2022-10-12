package program;

import entity.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(5, "Tung Nui", 25);
        Student student1 = new Student("Duc Phuc");
        Student student2 = new Student();

        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
