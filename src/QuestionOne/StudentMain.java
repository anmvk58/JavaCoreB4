package QuestionOne;

import java.util.Random;

public class StudentMain {
    public static void main(String[] args) {
        //Khởi tạo ra 5 học sinh:
        Random random = new Random();
        Student[] students = new Student[5];

        for(int i = 0; i < 5; i++){
            Student student = new Student();
            student.setScore(random.nextFloat()*10);
            students[i] = student;

        }
        // in ra danh sách student:
        for(Student a : students){
            a.printStudent();
        }
    }
}
