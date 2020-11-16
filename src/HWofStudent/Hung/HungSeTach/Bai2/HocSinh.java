package HWofStudent.Hung.HungSeTach.Bai2;

import java.util.Scanner;

public class HocSinh extends Nguoi{
    //lop
    private String lop;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap lop:");
        lop = sc.nextLine();
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "lop='" + lop + '\'' +
                ", id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
