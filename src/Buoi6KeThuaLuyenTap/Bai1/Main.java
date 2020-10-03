package Buoi6KeThuaLuyenTap.Bai3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon=-1;
        QuanLyThuVien quanLyThuVien = new QuanLyThuVien();
        while (true)
        {
            quanLyThuVien.menu();
            chon = new Scanner(System.in).nextInt();
            switch (chon)
            {
                case 1: quanLyThuVien.nhapTreEm();break;
                case 2: quanLyThuVien.nhapNguoiLon();break;
                case 3: quanLyThuVien.xuatTreEm();break;
                case 4: quanLyThuVien.xuatNguoiLon();break;
                case 5: quanLyThuVien.tongTienLamThe(); break;
                case 0: return;
                default:
                    System.out.println("Bạn chọn sai rồi");
            }
        }


    }
}
