package HWofStudent.Hung.DaHinh.Bai3;

import java.util.Scanner;

public class Bao extends TaiLieu{
//    ngày phát hành
    private int ngayPhatHanh;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ngay phat hanh:");
        ngayPhatHanh = sc.nextInt();
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void xuat(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soLuongPhatHanh=" + soLuongPhatHanh +
                '}';
    }
}
