package HWofStudent.Hung.DaHinh.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyThuVien quanLyThuVien = new QuanLyThuVien();
        Scanner sc = new Scanner(System.in);
        int chon;
        while(true){
            quanLyThuVien.menu();
            chon = sc.nextInt();

            switch (chon){
                case 1:
                    quanLyThuVien.nhapSach();
                    break;
                case 2:
                    quanLyThuVien.nhapTapChi();
                    break;
                case 3:
                    quanLyThuVien.nhapBao();
                    break;
                case 4:
                    quanLyThuVien.xuatSach();
                    break;
                case 5:
                    quanLyThuVien.xuatTapChi();
                    break;
                case 6:
                    quanLyThuVien.xuatBao();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Ban chon khong phu hop");
            }
        }
    }
}
