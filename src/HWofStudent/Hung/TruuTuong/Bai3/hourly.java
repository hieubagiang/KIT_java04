package HWofStudent.Hung.TruuTuong.Bai3;

public class hourly extends Employee{
    private int hoursWorked;

    public void addHours(int moreHours){
        this.hoursWorked = moreHours;
    }

    public double pay(){
        return hoursWorked*0;
    }

    @Override
    public String toString() {
        return "hourly{" +
                "hoursWorked=" + hoursWorked +
                '}';
    }
}
