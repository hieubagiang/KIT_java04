package Bai3.truutuong;

import java.util.Scanner;

public class Employee extends StaffMember {
    private String socialSecurityNumber;
    private double payRate;

    public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap CMND");
        socialSecurityNumber = sc.nextLine();
        System.out.println("Nhap phanTramLuong");
        payRate = sc.nextDouble();
    }

    public double pay(){

        return 0;
    }
}
