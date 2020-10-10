package Buoi6KeThuaLuyenTap.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon=-1;
        Quanly QLTV = new Quanly();
        while (true)
        {
            QLTV.Menu();
            chon = new Scanner( System.in).nextInt();
            switch (chon)
            {
                case 1: QLTV.nhapNVOngNuoc();break;
                case 2: QLTV.xuatNVOngNuoc();break;
                case 3: QLTV.nhapShipper();break;
                case 4: QLTV.xuatShipper();break;
                case 5: QLTV.nhapNVXeOm(); break;
                case 6: QLTV.xuatNVXeOm();break;
                case 7: QLTV.tongTien();break;
               // case 8: QLTV.thongKeLuongGiamDan();
                case 8: QLTV.xuatNV();
                case 0: return;
                default:
                    System.out.println("Bạn chọn sai rồi");
            }
        }



    }
}
