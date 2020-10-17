package Buoi8DaHinhLuyenTap.Bai1;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        QuanLiTaiLieu quanLiTaiLieu = new QuanLiTaiLieu();
        int chon = -1;
        while (true)
        {
            quanLiTaiLieu.menu();
            chon = new Scanner(System.in).nextInt();
            switch (chon)
            {
                case 1: quanLiTaiLieu.nhap(); break;
                case 2: quanLiTaiLieu.xuat(); break;
                case 3: quanLiTaiLieu.xuatTheoLoai(); break;
                case 0: exit(0);
                default:
                    System.out.println("Nhập lại!");
            }
        }
    }
}
