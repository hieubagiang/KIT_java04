package HWofStudent.Hung.TruuTuong.Bai3;

abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
    Staff staff;


    abstract double pay();

    @Override
    public String toString() {
        return "StaffMember{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", staff=" + staff +
                '}';
    }
}
