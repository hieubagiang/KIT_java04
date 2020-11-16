package Buoi10.Bai2.Bai4;

abstract class Person implements Mammal{
    private String fistName;
    BloodGroup nhomMau;
    Address diaChi;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }
}
