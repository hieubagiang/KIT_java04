package Buoi6KeThuaLuyenTap.Bai1;

import java.util.Scanner;

public class TreEm extends DocGia{
    private String hoTenNguoiDaiDien;

    public int tinhTienLamThe()
    {
        return soThangCoHieuLuc*5000;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoTenNguoiDaiDien");
        hoTenNguoiDaiDien = sc.nextLine();

    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TreEm{" + super.toString() +
                ", hoTenNguoiDaiDien='" + hoTenNguoiDaiDien + '\'' +
                '}';
    }

    public TreEm() {
    }

    public String getHoTenNguoiDaiDien() {
        return hoTenNguoiDaiDien;
    }

    public void setHoTenNguoiDaiDien(String hoTenNguoiDaiDien) {
        this.hoTenNguoiDaiDien = hoTenNguoiDaiDien;
    }
}
