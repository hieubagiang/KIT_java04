package HWofStudent.Hung.DaHinh.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi {
    ArrayList<DocGia> quanLylist = new ArrayList<>();

    public void menu() {
        System.out.println("\t\tQuan Ly Thu Vien");
        System.out.println("1. Nhap nguoi lon");
        System.out.println("2. Xuat nguoi lon");
        System.out.println("3. Nhap tre em");
        System.out.println("4. Xuat tre em");
        System.out.println("5. Tinh tong tien");
        System.out.println("0. Thoat");
        System.out.println("Ban chon : ");
    }

    Scanner sc = new Scanner(System.in);

    public void nhapNguoiLon() {
        int i = 1;
        while (true) {
            System.out.println("Nhap nguoi lon thu " + i + " :");
            DocGia tmp = new NguoiLon();
            tmp.nhap();
            quanLylist.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String c = sc.nextLine();
            if (c.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatNguoiLon() {
        System.out.println("\t\tDanh sach nguoi lon la: ");

        for (int i = 0; i < quanLylist.size(); i++) {
            if (quanLylist.get(i) instanceof NguoiLon) {
                ((NguoiLon) quanLylist.get(i)).xuat();
            }
        }
    }

    public void nhapTreEm() {
        int i = 0;
        while (true) {
            System.out.println("Nhap tre em thu " + (i+1) + " : ");
            DocGia tmp = new TreEm();
            tmp.nhap();
            quanLylist.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String c = sc.next();
            if (c.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatTreEm(){
        for(int i = 0 ; i < quanLylist.size() ; i++){
            if(quanLylist.get(i) instanceof TreEm){
                ((TreEm) quanLylist.get(i)).xuat();
            }
        }
    }

    public void tinhTienLamThe() {
        int tinhTienNguoiLon = 0;
        int tinhTienTreEm = 0;

        for (int i = 0; i < quanLylist.size(); i++) {
            if (quanLylist.get(i) instanceof NguoiLon) {
                tinhTienNguoiLon += quanLylist.get(i).tienLamTheNguoiLon();
            }
        }
        System.out.println("Tong tien cua nguoi lon : " + tinhTienNguoiLon);

        for (int i = 0; i < quanLylist.size(); i++) {
            if (quanLylist.get(i) instanceof TreEm) {
                tinhTienTreEm += quanLylist.get(i).tienLamTheTreEm();
            }
        }
        System.out.println("Tong tien tre em  : " + tinhTienTreEm);
    }

}
