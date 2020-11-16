package HWofStudent.Hung.KeThua.bai4;

import java.util.Scanner;

public class NhanVienXeOm extends Nguoi{
    private int soKM;

    public int luong(){
        return soKM*10000;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so duong di duoc (KM) :");
        soKM = sc.nextInt();
    }

    public void xuat(){
        System.out.println(toString());
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "NhanVienXeOm{" +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                ", soKM=" + soKM +
                '}';
    }
}
