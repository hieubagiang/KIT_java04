package HWofStudent.Hung.DaHinh.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPGT {
    ArrayList<PTGT> quanLyPTGT = new ArrayList<>();

    public void menu() {
        System.out.println("\tQUAN LY PHUONG TIEN GIAO THONG");
        System.out.println("1. Nhap o to");
        System.out.println("2. Xuat o to");
        System.out.println("3. Nhap xe may");
        System.out.println("4. Xuat xe may");
        System.out.println("5. Nhap xe tai");
        System.out.println("6. Xuat xe tai");
        System.out.println("7. Tim kiem phuong tien theo mau");
        System.out.println("0. Ket thuc");
        System.out.println("Ban chon:");
    }

    Scanner sc = new Scanner(System.in);

    public void nhapOto() {
        int i = 1;
        while (true) {
            PTGT tmp = new OTo();
            System.out.println("Nhap o to thu " + i + ":");
            tmp.nhap();
            quanLyPTGT.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatOto() {
        for (PTGT tmp : quanLyPTGT) {
            if (tmp instanceof OTo) {
                tmp.xuat();
            }
        }
    }

    public void nhapXeMay() {
        int i = 1;
        while (true) {
            PTGT tmp = new XeMay();
            System.out.println("Nhap xe may thu " + i + ":");
            tmp.nhap();
            quanLyPTGT.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatXeMay() {
        for (PTGT tmp : quanLyPTGT) {
            if (tmp instanceof XeMay) {
                tmp.xuat();
            }
        }
    }

    public void nhapXeTai() {
        int i = 1;
        while (true) {
            PTGT tmp = new XeTai();
            System.out.println("Nhap xe tai thu " + i + ":");
            tmp.nhap();
            quanLyPTGT.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String chon = sc.next();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void xuatXeTai() {
        for (PTGT tmp : quanLyPTGT) {
            if (tmp instanceof XeTai) {
                tmp.xuat();
            }
        }
    }

    public void timPhuongTienTheoMau(){
        System.out.println("Nhap mau ban muon tim:");
        String mau = sc.nextLine();
        for(PTGT tmp : quanLyPTGT){
            if(tmp.mau.equalsIgnoreCase(mau)){
                tmp.xuat();
            }
        }
    }
}
