package HWofStudent.Hung.DaHinh.Bai3;

import java.util.Scanner;

public class Sach extends TaiLieu{
//    Tên tác giả, số trang
    private String tenTacGia;
    private int soTrang;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ten tac gia:");
        tenTacGia = sc.nextLine();
        System.out.println("Nhap so trang:");
        soTrang = sc.nextInt();
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soLuongPhatHanh=" + soLuongPhatHanh +
                '}';
    }


}
