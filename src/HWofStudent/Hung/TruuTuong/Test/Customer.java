package HWofStudent.Hung.TruuTuong.Test;

public class Customer extends Person {
    private int blance;

    public Customer(String name, String address, int blance) {
        super(name, address);
        this.blance = blance;
    }
    
    public void display(){
        System.out.println("Customer name : " + getName());
        System.out.println("Customer address : " + getAddress());
        System.out.println("Customer blance : " + blance);
    }

}
