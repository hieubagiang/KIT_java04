package Buoi5.Bai1;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        GiangVien gv = new GiangVien();
        sv.nhap();
        gv.nhap();
        sv.xuat();
        gv.xuat();
        // cau 2
        sv.hocVoiGiangVien(gv);
        System.out.println();
    }
}
