package Buoi5.Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi {


    private String maLop;
    private String nganhHoc;
    private String khoa;

    public void nhap()
    {
        //Họ tên, năm sinh, quê quán, giới tính, Mã lớp, ngành học, khoá;
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap maLop: ");
        maLop = scanner.nextLine();
        System.out.println("Nhap nganhHoc: ");
        nganhHoc = scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();

    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SinhVien{\n" +
                super.toString()+
                ",\n maLop='" + maLop + '\'' +
                ",\n nganhHoc='" + nganhHoc + '\'' +
                ",\n khoa='" + khoa + '\'' +
                '}';
    }

    public SinhVien() {
    }


}
