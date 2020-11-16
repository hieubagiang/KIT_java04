package HWofStudent.Hung.TruuTuong.Bai4;

abstract class Person implements Mammal {
    String firstname;
    Address address;
    BloodGroup bloodGroup;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Person(BloodGroup bloodGroup){
        this.bloodGroup = bloodGroup;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}



