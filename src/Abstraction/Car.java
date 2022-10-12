package Abstraction;

public abstract class Car extends Vehicle {
    public Car() {
        wheelAmount = 4;
    }

    public abstract void napNhienLieu();

    public void ruaXe(){
        System.out.println("Xe được rửa với giá 100k");
    }

}
