package Buoi6KeThuaLuyenTap.Bai1;

import java.util.Scanner;

public class NguoiLon extends DocGia{
    private String soCMND;

    public int tinhTienLamThe()
    {
        return soThangCoHieuLuc*10000;
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NguoiLon{" +super.toString() +
                ", soCMND='" + soCMND + '\'' +
                '}';
    }

    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap soCMND");
        soCMND = sc.nextLine();
    }
    public NguoiLon() {
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
}
