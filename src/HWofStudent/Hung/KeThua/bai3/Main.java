package HWofStudent.Hung.KeThua.bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int chon;
        QuanLyThuVien quanLyThuVien = new QuanLyThuVien();
        while (true){
            Scanner sc = new Scanner(System.in);
            quanLyThuVien.menu();
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    quanLyThuVien.nhapTreEm();
                    break;
                case 2:
                    quanLyThuVien.nhapNguoiLon();
                    break;
                case 3:
                    quanLyThuVien.xuatTreEm();
                    break;
                case 4:
                    quanLyThuVien.xuatNguoiLon();
                case 5:
                    quanLyThuVien.tongTien();
                case 0:
                    return;
                default:
                    System.out.println("Ban da chon sai");
            }
        }
    }
}
