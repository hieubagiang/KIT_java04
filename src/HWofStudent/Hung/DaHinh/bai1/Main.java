package HWofStudent.Hung.DaHinh.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon;
        QuanLi quanLi = new QuanLi();
        Scanner sc = new Scanner(System.in);

        while (true) {
            quanLi.menu();
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    quanLi.nhapNguoiLon();
                    break;
                case 2:
                    quanLi.xuatNguoiLon();
                    break;
                case 3:
                    quanLi.nhapTreEm();
                    break;
                case 4:
                    quanLi.xuatTreEm();
                    break;
                case 5:
                    quanLi.tinhTienLamThe();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Ban da chon sai");
            }
        }

    }

}
