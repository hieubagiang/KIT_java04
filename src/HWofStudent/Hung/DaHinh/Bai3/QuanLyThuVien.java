package HWofStudent.Hung.DaHinh.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    ArrayList<TaiLieu> quanLyThuVien = new ArrayList<>();

    public void menu() {
        System.out.println("\t\tQUAN LY THU VIEN");
        System.out.println("1. Nhap sach");
        System.out.println("2. Nhap tap chi");
        System.out.println("3. Nhap bap");
        System.out.println("4. Xuat sach");
        System.out.println("5. Xuat tap chi");
        System.out.println("6. Xuat bao");
        System.out.println("0. Thoat");
    }

    Scanner sc = new Scanner(System.in);

    public void nhapSach() {
        int i = 1;
        while (true) {
            TaiLieu tmp = new Sach();
            System.out.println("Nhap quyen sach thu " + i + " :");
            tmp.nhap();
            quanLyThuVien.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void nhapTapChi() {
        int i = 1;

        while (true) {
            TaiLieu tmp = new TapChi();
            System.out.println("Nhap tap chi thu " + i + " :");
            tmp.nhap();
            quanLyThuVien.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n) ");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void nhapBao() {
        int i = 1;

        while (true) {
            TaiLieu tmp = new Bao();
            System.out.println("Nhap to bao thu " + i + " :");
            tmp.nhap();
            quanLyThuVien.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n) ");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatSach() {
        for(int i = 0 ; i < quanLyThuVien.size() ; i++){
            if(quanLyThuVien.get(i) instanceof  Sach){
                ((Sach) quanLyThuVien.get(i)).xuat();
            }
        }
    }

    public void xuatTapChi() {
        for(int i = 0 ; i < quanLyThuVien.size() ; i++){
            if(quanLyThuVien.get(i) instanceof TapChi){
                ((TapChi) quanLyThuVien.get(i)).xuat();
            }
        }
    }

    public void xuatBao() {
        for(int i = 0 ; i < quanLyThuVien.size() ; i++){
            if(quanLyThuVien.get(i) instanceof  Bao){
                ((Bao) quanLyThuVien.get(i)).xuat();
            }
        }
    }
}
