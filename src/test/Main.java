package test;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        // Gan thong tin cho employee 1:
        employee1.setId(1);
        employee1.setName("Nguyen Van A");
        employee1.setSalary(1000);

        // Gan thong tin cho employee 2:
        employee2.setId(2);
        employee2.setName("Tran Van B");
        employee2.setSalary(4000);

        System.out.println("Muc luong cua nhan vien so 2 la: " + employee2.getSalary());
//        System.out.println(employee1);
//        System.out.println("\n******************\n");
//        System.out.println(employee2);
    }
}
