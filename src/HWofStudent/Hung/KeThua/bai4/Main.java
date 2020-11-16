package HWofStudent.Hung.KeThua.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon;
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);

        while (true){
            chon = sc.nextInt();
            quanLyNhanVien.menu();
            switch (chon){
                case 1:
                    quanLyNhanVien.nhapNhanVienOngNuoc();
                    break;
                case 2:
                    quanLyNhanVien.xuatNhanVienOngNuoc();
                    break;
                case 3:
                    quanLyNhanVien.nhapNhanVienShipper();
                    break;
                case 4:
                    quanLyNhanVien.xuatNhanVienGiaoHang();
                    break;
                case 5:
                    quanLyNhanVien.nhapNhanVienXeOm();
                    break;
                case 6:
                    quanLyNhanVien.xuatNhanVienXeOm();
                    break;
                case 7:
                    quanLyNhanVien.tongTien();
                    break;
                case 8:
                    quanLyNhanVien.thongKeNhanVienGiamDan();
                    break;
                default:
                    System.out.println("Ban da chon sai");
            }
        }
    }
}