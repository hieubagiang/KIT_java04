package Bai3.truutuong;

public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate, int hoursWorked) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.hoursWorked = hoursWorked;
    }

    public void addHours(){
        int moreHours;
    }

    public double pay(){
        return 0;
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hoursWorked=" + hoursWorked +
                '}';
    }
}
