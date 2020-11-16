package HWofStudent.Hung.HungSeTach.Bai2;

import java.util.Scanner;

public class Nguoi {
    //id, ho ten, nam sinh, que quan
    protected String id;
    protected String hoTen;
    protected int namSinh;
    protected String queQuan;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id:");
        id = sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap que quan:");
        queQuan = sc.nextLine();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
