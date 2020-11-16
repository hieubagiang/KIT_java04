package HWofStudent.Hung.KeThua.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    ArrayList<TreEm> TreEmList;
    ArrayList<NguoiLon> NguoiLonList;

    public void menu(){
        System.out.println("\t\tQuan Ly Thu Vien");
        System.out.println("1.Nhap doc gia tre em");
        System.out.println("2.Nhap doc gia nguoi lon");
        System.out.println("3.Xuat doc gia tre em");
        System.out.println("4.Xuat doc gia nguoi lon");
        System.out.println("5.Tinh tong tien lam the");
        System.out.println("0.Exit");
        System.out.println("Moi ban chon : ");
    }

    public  QuanLyThuVien(){
        TreEmList = new ArrayList<>();
        NguoiLonList = new ArrayList<>();
    }

    public void xuatTreEm(){
        System.out.println("\t\tDanh Sach Doc Gia Tre Em");
        for(int i = 0 ; i<TreEmList.size() ; i++){
            System.out.println((i+1) + ".");
            TreEmList.get(i).xuat();
        }
    }

    public void xuatNguoiLon(){
        System.out.println("\t\tDanh Sach Doc Gia Nguoi Lon");
        int i = 1;
        for(NguoiLon tmp : NguoiLonList){
            System.out.printf("%d. ", i);
            tmp.xuat();
        }
    }

    public void nhapTreEm(){
        Scanner sc = new Scanner(System.in);
        int n;
        TreEm tmp = new TreEm();
        System.out.printf("Nhap so tre em can nhap: ");
        n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            System.out.println("Tre em thu "+ (i+1) +" : ");
            tmp.nhap();
            TreEmList.add(tmp);
        }
    }

    public void nhapNguoiLon(){
        Scanner sc = new Scanner(System.in);
        String chon = "";
        int i = 0;
        while(true){
            if(chon.equalsIgnoreCase("n")){
                break;
            }

            System.out.println("Nhap nguoi lon thu "+ (i+1) +" : ");
            NguoiLon tmp = new NguoiLon();
            tmp.nhap();
            NguoiLonList.add(tmp);
            System.out.println("Nhap tiep ? (y/n)");
            chon = sc.next();
        }
    }

    public void tongTien(){
        int tongTien = 0 ;
        for(TreEm tmp : TreEmList){
            tongTien += tmp.tinhTienLamThe();
        }

        for(NguoiLon tmp : NguoiLonList){
            tongTien += tmp.tinhTienLamThe();
        }

        System.out.println("Tong tien lam the la: " + tongTien);
    }
}
