package HWofStudent.Hung.KeThua.bai3;

import java.util.Scanner;

public class TreEm extends DocGia {
    private String nguoiDaiDien;

    public int tinhTienLamThe(){
        return soThangCoHieuLuc * 5000;
    }

    public void xuat(){
        System.out.println(toString());
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Ho ten nguoi dai dien:");
        nguoiDaiDien = sc.nextLine();
    }

    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }

    @Override
    public String toString() {
        return "TreEm{" + super.toString() +
                "nguoiDaiDien='" + nguoiDaiDien + '\'' +
                '}';
    }
}
