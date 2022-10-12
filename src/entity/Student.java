package entity;

public class Student {
    int id;
    String name;
    int age;

    //method ???
    public Student() {
    }

    public Student(int id1, String name1, int age1){
        this.id = id1;
        this.name = name1;
        this.age = age1;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "entity.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
