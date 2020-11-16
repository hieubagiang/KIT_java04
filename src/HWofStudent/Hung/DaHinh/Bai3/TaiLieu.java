package HWofStudent.Hung.DaHinh.Bai3;

import java.util.Scanner;

public class TaiLieu {
//    Mã tài liệu, Tên nhà xuất bản, Số bản phát hành.
    protected String maTaiLieu;
    protected String tenNhaXuatBan;
    protected int soLuongPhatHanh;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu:");
        maTaiLieu = sc.nextLine();
        System.out.println("Nhap ten nha san xuat:");
        tenNhaXuatBan = sc.nextLine();
        System.out.println("Nhap so luong phat hanh:");
        soLuongPhatHanh = sc.nextInt();
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soLuongPhatHanh=" + soLuongPhatHanh +
                '}';
    }
}
