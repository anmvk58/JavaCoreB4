package QuestionOne;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float score;

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập HomeTown: ");
        String hometown = scanner.nextLine();
        this.name = name;
        this.hometown = hometown;
        this.score = 0f;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void addScore(float addValue){
        this.score += addValue;
    }

    public void printStudent(){
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        if(score < 4){
            System.out.println("Học lực: Yếu" );
        } else if (score < 6){
            System.out.println("Học lực: Trung bình" );
        } else if (score < 8){
            System.out.println("Học lực: Khá" );
        } else {
            System.out.println("Học lực: Giỏi");
        }
        System.out.println("--------------------------------");
    }
}


