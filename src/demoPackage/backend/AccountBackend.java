package demoPackage.backend;

import demoPackage.entity.Account;

import java.time.LocalDate;

public class AccountBackend {
    // Thuộc tính (properties)

    // Phương thức (method)
    public void exerciseOne(){
        //thực hiện làm bài tập trong đề bài VTI đưa cho
        // ví dụ bài tập này là khai báo ra 4 Account và in ra màn hình

        // Khai báo ra 3 đối tượng Account:
        LocalDate date1 = LocalDate.of(2020, 1, 8);
        Account account1 = new Account(1, "Nguyễn Văn A", "Dev", 1000, date1);
        Account account2 = new Account(2, "Trần Văn B", "PM", 2000, date1);
        Account account3 = new Account(3, "Tạ Việt C", "QA", 800, date1);

        // In ra 3 đối tượng trên:
        System.out.println("Thông tin Account 1: ");
        System.out.println(account1);
        System.out.println("--------------------------");

        System.out.println("Thông tin Account 2: ");
        System.out.println(account2);
        System.out.println("--------------------------");

        System.out.println("Thông tin Account 3: ");
        System.out.println(account3);
        System.out.println("--------------------------");
    }
}
