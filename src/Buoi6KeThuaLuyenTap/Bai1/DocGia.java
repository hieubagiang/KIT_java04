package Buoi6KeThuaLuyenTap.Bai3;

import java.util.Scanner;

public class DocGia {
    protected String hoTen;
    protected String ngayLapThe;
    protected int soThangCoHieuLuc;

    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", ngayLapThe='" + ngayLapThe + '\'' +
                ", soThangCoHieuLuc=" + soThangCoHieuLuc;
    }

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngayLapThe");
        ngayLapThe = sc.nextLine();
        System.out.println("Nhap soThangCoHieuLuc");
        soThangCoHieuLuc = sc.nextInt();
        sc.nextLine();//fflush stdin
    }
    public DocGia() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayLapThe() {
        return ngayLapThe;
    }

    public void setNgayLapThe(String ngayLapThe) {
        this.ngayLapThe = ngayLapThe;
    }

    public int getSoThangCoHieuLuc() {
        return soThangCoHieuLuc;
    }

    public void setSoThangCoHieuLuc(int soThangCoHieuLuc) {
        this.soThangCoHieuLuc = soThangCoHieuLuc;
    }
}
