package HWofStudent.Hung.TruuTuong.Bai4;

import java.util.Date;

public class Woman extends Person{

    boolean WearingMaekup;

    public void putMakeupOn(){

    }

    public boolean isWearingMaekup(){
        return WearingMaekup;
    }

    public Woman(BloodGroup bloodGroup) {
        super(bloodGroup);
    }

    @Override
    public void setDateOfBirth(Date dob) {

    }

    @Override
    public int getAgeAsDays() {
        return 0;
    }
}
