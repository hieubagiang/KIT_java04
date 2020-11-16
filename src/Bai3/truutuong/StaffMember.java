package Bai3.truutuong;

import java.util.Scanner;

public abstract class StaffMember {
    private String name;
    private String address;
    private String phone;

    public StaffMember(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        name = sc.nextLine();
        System.out.println("Nhap diaChi");
        address = sc.nextLine();
        System.out.println("Nhap sdt");
        phone = sc.nextLine();
        sc.nextLine();
    }

    public void xuat(){
        System.out.println(toString());
    }

    public abstract double pay();


    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
