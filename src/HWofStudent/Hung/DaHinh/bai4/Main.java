package HWofStudent.Hung.DaHinh.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPGT quanLyPGT = new QuanLyPGT();
        Scanner sc = new Scanner(System.in);

        int chon;
        while (true){
            quanLyPGT.menu();
            chon = sc.nextInt();

            switch (chon){
                case 1:
                    quanLyPGT.nhapOto();
                    break;
                case 2:
                    quanLyPGT.xuatOto();
                    break;
                case 3:
                    quanLyPGT.nhapXeMay();
                    break;
                case 4:
                    quanLyPGT.xuatXeMay();
                    break;
                case 5:
                    quanLyPGT.nhapXeTai();
                    break;
                case 6:
                    quanLyPGT.xuatXeTai();
                    break;
                case 7:
                    sc.nextLine();
                    quanLyPGT.timPhuongTienTheoMau();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Ban da chon sai");
            }
        }
    }
}
