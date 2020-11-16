package HWofStudent.Hung.KeThua.Bai1;

public class Main {

    public static void main(String[] args) {
        GiangVien gv = new GiangVien();
        SinhVien sv = new SinhVien();

        gv.nhap();
        sv.nhap();

        gv.xuat();
        sv.xuat();
        sv.coKhaNangHocKhong(gv);
    }
}
