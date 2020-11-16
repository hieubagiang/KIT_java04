package HWofStudent.Hung.KeThua.Bai2;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    //Ngày xuất bản, số trang, danh mục xuất bản
    private int ngayXB;
    private int soTrang;
    private String danhMucXB;

    public void nhap() {
        System.out.println("Nhap tai lieu cua tap chi\n");
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ngay xuat ban: ");
        ngayXB = sc.nextInt();
        System.out.println("Nhap so trang: ");
        soTrang = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap danh muc xuat ban: ");
        danhMucXB = sc.nextLine();
    }

    public int getNgayXB() {
        return ngayXB;
    }

    public void setNgayXB(int ngayXB) {
        this.ngayXB = ngayXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getDanhMucXB() {
        return danhMucXB;
    }

    public void setDanhMucXB(String danhMucXB) {
        this.danhMucXB = danhMucXB;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TapChi{" + super.toString() +
                ", ngayXB=" + ngayXB +
                ", soTrang=" + soTrang +
                ", danhMucXB='" + danhMucXB + '\'' +
                '}';
    }
}
