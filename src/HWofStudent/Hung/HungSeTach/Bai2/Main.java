package HWofStudent.Hung.HungSeTach.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyHocSinh quanLyHocSinh = new QuanLyHocSinh();
        int chon;

        Scanner sc = new Scanner(System.in);
        while (true){
            quanLyHocSinh.menu();
            chon = sc.nextInt();

            switch (chon){
                case 1:
                    quanLyHocSinh.nhapHocSinh();
                    break;
                case 2:
                    quanLyHocSinh.xuatToanBo();
                    break;
                case 3:
                    quanLyHocSinh.hienThiHSCoDoTuoiChon();
                    break;
                case 4:
                    quanLyHocSinh.hienThiHSCoQueChon();
                    break;
                case 0:
                    System.out.println("Ban da chon thoat khoi chuong trinh");
                    return;
                default:
                    System.out.println("Chuc nang ban chon khong phu hop");
            }
        }
    }
}
