package HWofStudent.Hung.DaHinh.bai4;

import java.util.Scanner;

public class PTGT {
//    Hãng sản xuất,năm sản xuất, giá bán và màu.
    protected String hangSX;
    protected int namSX;
    protected int giaBan;
    protected String mau;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang san xuat:");
        hangSX = sc.nextLine();
        System.out.println("NHap nam san xuat:");
        namSX = sc.nextInt();
        System.out.println("Nhap gia ban:");
        giaBan = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mau xe:");
        mau = sc.nextLine();
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "PTGT{" +
                "hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' +
                '}';
    }
}
