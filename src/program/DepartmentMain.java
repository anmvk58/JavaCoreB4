package program;

import entity.Department;

public class DepartmentMain {
    public static void main(String[] args) {
        Department department = new Department("Marketing");
        Department department2 = new Department("Sale");

        System.out.println(department);
        System.out.println(department2);
    }
}
