package demoPackage.entity;

import java.time.LocalDate;

public class Account {
    int id;
    String name;
    String role;
    int salary;
    LocalDate date;

    public Account(int id, String name, String role, int salary, LocalDate date) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
