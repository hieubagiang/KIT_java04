package HWofStudent.Hung.DaHinh.Bai3;

import java.util.Scanner;

public class TapChi extends TaiLieu{
//    Số phát hành, tháng phát hành
    private String soPhatHanh;
    private int thangPhatHanh;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so phat hanh:");
        soPhatHanh = sc.nextLine();
        System.out.println("Nhap thang phat hanh:");
        thangPhatHanh = sc.nextInt();
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soLuongPhatHanh=" + soLuongPhatHanh +
                '}';
    }
}
