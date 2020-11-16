package Bai5.truutuong;

interface CLASS {
    String name="";
    String studenList="";
    String nameOfStudents="";
    String advisor="";

    public void printList();
}

class STUDENT extends PERSON implements CLASS{
    private String Class;

    @Override
    public void printList() {

    }
}

class TEACHER extends PERSON implements CLASS{
    private String Rank;

    @Override
    public void printList() {

    }
}


