package Interface;

public class Student implements Study, Relax, Personal{
    //Thuộc tính
    private int id;
    private String name;
    private String hometown;


    @Override
    public void diemDanh() {
        System.out.println("Học sinh đi điểm danh");
    }

    @Override
    public void diHoc() {
        System.out.println("Học sinh đi học");
    }

    @Override
    public void choiGame() {
        System.out.println("Quẩy Liên Minh Huyền Thoại LOL");
    }

    @Override
    public void tanGai() {
        System.out.println("Sinh viên tìm tình yêu đích thực cho mình");
    }

    @Override
    public void veSinhCaNhan() {
        System.out.println("Đánh răng + rửa mặt");
    }

    @Override
    public void nauCom() {
        System.out.println("Học sinh nấu cơm để ăn");
    }
}
