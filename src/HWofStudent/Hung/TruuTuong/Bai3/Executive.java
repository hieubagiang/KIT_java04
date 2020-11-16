package HWofStudent.Hung.TruuTuong.Bai3;

public class Executive extends Employee {
    private double bonus;

    public void awardBonus(double execBonus){
        this.bonus = execBonus;
    }

    public double pay(){
        return bonus*0;
    }
}
