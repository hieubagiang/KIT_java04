package HWofStudent.Hung.TruuTuong.Bai3;

public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    @Override
    public String toString() {
        return "Employee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", payRate=" + payRate +
                '}';
    }

    @Override
    double pay() {
        return 0;
    }
}
