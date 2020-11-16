package HWofStudent.Hung.KeThua.bai4;

import java.util.Scanner;

public class NhanVienGiaoHang extends Nguoi{
    private int soHangGiao;

    public int luong(){
        return soHangGiao*33500;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so hang da giao :");
        soHangGiao = sc.nextInt();
    }

    public void xuat(){
        System.out.println(toString());
    }

    public int getSoHangGiao() {
        return soHangGiao;
    }

    public void setSoHangGiao(int soHangGiao) {
        this.soHangGiao = soHangGiao;
    }

    @Override
    public String toString() {
        return "NhanVienGiaoHang{" +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                ", soHangGiao=" + soHangGiao +
                '}';
    }
}
