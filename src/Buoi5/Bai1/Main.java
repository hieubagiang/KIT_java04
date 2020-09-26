package Buoi5.Bai1;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();

        GiangVien gv = new GiangVien();
        gv.nhap();

        gv.xuat();
    }
}
