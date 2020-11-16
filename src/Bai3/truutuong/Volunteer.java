package Bai3.truutuong;

public class Volunteer extends StaffMember {

    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }

    public double pay(){
        System.out.println("So tien tra la:");
        System.out.println(150000);
        return 0;
    }
}
