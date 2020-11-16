package Bai3.truutuong;

public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate, double bonus) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    public void awardBonus(){
        double execBonus;
    }

    public double pay(){
        return 0;
    }
}
