package HWofStudent.Hung.DaHinh.bai1;

import java.util.Scanner;

public class DocGia {
    protected String hoTen;
    protected String ngayLamThe;
    protected int soThangCoHieuLuc;

    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ho ten :");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay thang lam the: ");
        ngayLamThe = sc.nextLine();
        System.out.println("Nhap so thang co hieu luc: ");
        soThangCoHieuLuc = sc.nextInt();
    }

    public int tienLamTheTreEm(){
        return soThangCoHieuLuc*5000;
    }

    public int tienLamTheNguoiLon(){
        return soThangCoHieuLuc*10000;
    }

    @Override
    public String toString() {
        return "DocGia{" +
                "hoTen='" + hoTen + '\'' +
                ", ngayLamThe='" + ngayLamThe + '\'' +
                ", soThangCoHieuLuc=" + soThangCoHieuLuc +
                '}';
    }

}
