package Bai4.truutuong;

interface Mammal {
    double Date = 0;
    void setDateOfBirth();

    default int getAgeAsDay() {
        return 0;
    }
}

class Person implements Mammal{
    private String firstname;

    @Override
    public void setDateOfBirth() {
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
