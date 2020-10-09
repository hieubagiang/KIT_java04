package Buoi5.Bai1;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hoTen: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap namSinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // xóa '\n'
        System.out.println("Nhap queQuan: ");
        queQuan = scanner.nextLine();
        System.out.println("Nhap gioiTinh: ");
        gioiTinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", queQuan='" + queQuan + '\'' +
                ", gioiTinh='" + gioiTinh + '\''
                ;
    }
}
