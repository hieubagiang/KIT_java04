package HWofStudent.Hung.TruuTuong.Bai4;

import java.util.Date;

public class Man extends Person{
    boolean WatchingFootball;

    public Man(BloodGroup bloodGroup) {
        super(bloodGroup);
    }

    public void watchFootball(){

    }

    public boolean isWatchingFootball() {
        return WatchingFootball;
    }

    @Override
    public void setDateOfBirth(Date dob) {

    }

    @Override
    public int getAgeAsDays() {
        return 0;
    }
}
