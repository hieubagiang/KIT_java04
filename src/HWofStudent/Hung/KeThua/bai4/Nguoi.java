package HWofStudent.Hung.KeThua.bai4;

import java.util.Scanner;

public class Nguoi {
    //ho ten, tuoi, gioi tinh, SDT, dia chi, chieu cao, can nang,
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String SDT;
    protected String diaChi;
    protected int chieuCao;
    protected int canNang;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh :");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap so dien thoai :");
        SDT = sc.nextLine();
        System.out.println("Nhap dia chi :");
        diaChi = sc.nextLine();
        System.out.println("Nhap chieu cao :");
        chieuCao = sc.nextInt();
        System.out.println("Nhap can nang :");
        canNang = sc.nextInt();
    }

    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", SDT='" + SDT + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chieuCao=" + chieuCao +
                ", canNang=" + canNang +
                '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
     
}
