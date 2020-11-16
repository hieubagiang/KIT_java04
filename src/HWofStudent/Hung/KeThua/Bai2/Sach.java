package HWofStudent.Hung.KeThua.Bai2;

import java.util.Scanner;

public class Sach extends TaiLieu {
    //Số trang, năm xuất bản, lần tái bản, tên tác giả
    private int soTrang;
    private int namXB;
    private int lanTB;
    private String tenTG;

    public void nhap(){
        System.out.println("Nhap tai lieu cua sach\n");
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so trang: ");
        soTrang = sc.nextInt();
        System.out.println("Nhap nam xuat ban: ");
        namXB = sc.nextInt();
        System.out.println("Nhap lan tai ban: ");
        lanTB = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten tac gia: ");
        tenTG = sc.nextLine();
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getLanTB() {
        return lanTB;
    }

    public void setLanTB(int lanTB) {
        this.lanTB = lanTB;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public void xuat(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() +
                ", soTrang=" + soTrang +
                ", namXB=" + namXB +
                ", lanTB=" + lanTB +
                ", tenTG='" + tenTG + '\'' +
                '}';
    }
}
