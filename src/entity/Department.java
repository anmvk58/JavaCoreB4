package entity;

public class Department {
    int departmentId;
    String departmentName;

    public Department(String departmentName) {
        this.departmentId = 10;
        this.departmentName = departmentName;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "entity.Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
