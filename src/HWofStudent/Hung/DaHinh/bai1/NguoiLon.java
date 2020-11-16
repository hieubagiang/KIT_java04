package HWofStudent.Hung.DaHinh.bai1;

import java.util.Scanner;

public class NguoiLon extends DocGia{
    private String cmnd;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so CMND hoac the can cuoc:");
        cmnd = sc.nextLine();
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void xuat(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "NguoiLon{" +
                "cmnd='" + cmnd + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayLamThe='" + ngayLamThe + '\'' +
                ", soThangCoHieuLuc=" + soThangCoHieuLuc +
                ", soTienLamThe=" + super.tienLamTheNguoiLon() +
                '}';
    }
}
