package HWofStudent.Hung.KeThua.bai4;

import java.util.Scanner;

public class ThoSuaOngNuoc extends Nguoi {
        private int soGioSua;
        public int luong(){
            return soGioSua*50000;
        }

        public void nhap(){
            Scanner sc = new Scanner(System.in);
            super.nhap();
            System.out.println("Nhap so gio sua :");
            soGioSua = sc.nextInt();
        }

        public void xuat(){
            System.out.println(toString());
        }

        public int getSoGioSua() {
        return soGioSua;
        }

        public void setSoGioSua(int soGioSua) {
        this.soGioSua = soGioSua;
        }

    @Override
    public String toString() {
        return "ThoSuaOngNuoc{" +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                ", soGioSua=" + soGioSua +
                '}';
    }
}
