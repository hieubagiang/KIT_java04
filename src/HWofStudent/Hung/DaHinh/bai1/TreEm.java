package HWofStudent.Hung.DaHinh.bai1;

import java.util.Scanner;

public class TreEm extends DocGia {
        private String nguoiDaiDien;

        Scanner sc = new Scanner(System.in);
        public void nhap(){
            super.nhap();
            System.out.println("Nhap nguoi dai dien :");
            nguoiDaiDien = sc.nextLine();
        }

    public String getNguoiDaiDien() {
        return nguoiDaiDien;
    }

    public void setNguoiDaiDien(String nguoiDaiDien) {
        this.nguoiDaiDien = nguoiDaiDien;
    }

    public void xuat(){
            System.out.println(toString());
        }
    @Override
    public String toString() {
        return "TreEm{" +
                "nguoiDaiDien='" + nguoiDaiDien + '\'' +
                ", sc=" + sc +
                ", hoTen='" + hoTen + '\'' +
                ", ngayLamThe='" + ngayLamThe + '\'' +
                ", soThangCoHieuLuc=" + soThangCoHieuLuc +
                ", soTienLamThe=" + tienLamTheTreEm() +
                '}';
    }
}
