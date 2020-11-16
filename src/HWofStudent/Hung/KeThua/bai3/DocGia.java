package HWofStudent.Hung.KeThua.bai3;

import java.util.Scanner;

public class DocGia {
    protected String hoTen;
    protected int ngayLapThe;
    protected int soThangCoHieuLuc;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten :");
        hoTen = sc.nextLine();
        System.out.println("Ngay lap the: ");
        ngayLapThe = sc.nextInt();
        System.out.println("So thang co hieu luc:");
        soThangCoHieuLuc = sc.nextInt();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgayLapThe() {
        return ngayLapThe;
    }

    public void setNgayLapThe(int ngayLapThe) {
        this.ngayLapThe = ngayLapThe;
    }

    public int getSoThangCoHieuLuc() {
        return soThangCoHieuLuc;
    }

    public void setSoThangCoHieuLuc(int soThangCoHieuLuc) {
        this.soThangCoHieuLuc = soThangCoHieuLuc;
    }

    @Override
    public String toString() {
        return "DocGia{" +
                "hoTen='" + hoTen + '\'' +
                ", ngayLapThe=" + ngayLapThe +
                ", soThangCoHieuLuc=" + soThangCoHieuLuc +
                '}';
    }
}
