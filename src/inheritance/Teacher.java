package inheritance;

public class Teacher extends Person{
    private String subject;
    private float salary;

    public Teacher(int age, String name, String subject, float salary) {
        super(age, name);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age='" + super.getAge() + '\'' +
                "name='" + super.getName() + '\'' +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
