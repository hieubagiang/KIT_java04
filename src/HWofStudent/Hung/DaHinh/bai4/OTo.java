package HWofStudent.Hung.DaHinh.bai4;

import java.util.Scanner;

public class OTo extends PTGT{
//    số chỗ ngồi, kiểu động cơ
    private int soChoNgoi;
    private String kieuDongCo;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so cho ngoi:");
        soChoNgoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap kieu dong co:");
        kieuDongCo = sc.nextLine();
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "OTo{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' +
                '}';
    }
}
