package HWofStudent.Hung.DaHinh.bai4;

import java.util.Scanner;

public class XeTai extends PTGT{
//    trọng tải
    private String trongTai;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap trong tai:");
        trongTai = sc.nextLine();
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai='" + trongTai + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\'' +
                '}';
    }
}
