package HWofStudent.Hung.DaHinh.bai4;

import java.util.Scanner;

public class XeMay extends PTGT{
//    công suất
    private String congSuat;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap cong suat:");
        congSuat = sc.nextLine();
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' +
                '}';
    }
}
