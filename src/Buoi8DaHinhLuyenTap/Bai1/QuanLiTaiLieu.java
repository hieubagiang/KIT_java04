package Buoi8DaHinhLuyenTap.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiTaiLieu {
    // quản lí báo, sách , tạp chí
    ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu()
    {
        System.out.println("\t\tQUAN LI TAI LIEU");
        System.out.println("1. Nhập thông tin về các tài liệu\n" +
                "2. Hiển thị thông tin về các tài liệu\n" +
                "3. Xuất ra màn hình tài liệu theo loại ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }
    public QuanLiTaiLieu() {
    }
    //- Nhập thông tin về các tài liệu
    public void nhap()
    {
        System.out.println("Nhập loại tài liệu muốn nhập (sach/tap chi/bao): ");
        String loai = sc.nextLine().toLowerCase();

        TaiLieu tmp = null; // khai bao bien
        switch (loai)
        {
            case "sach" : tmp = new Sach(); break;
            case "tap chi": tmp = new TapChi(); break;
            case "bao": tmp = new Bao(); break;
            default:
                System.out.println("Nhập ngu!");
        }
        tmp.nhapInfo();
        danhSachTaiLieu.add(tmp);
    }
    //- Hiển thị thông tin về các tài liệu
    public void xuat()
    {
        System.out.println("\t\tDANH SACH TAI LIEU");
        for (int i = 0; i < danhSachTaiLieu.size() ; i++) {
            danhSachTaiLieu.get(i).xuatInfo();
        }
    }

    //- Xuất ra màn hình tài liệu theo loại
    public void xuatTheoLoai()
    {
        System.out.println("Nhập loại tài liệu muốn xuất (sach/tap chi/bao): ");
        String loai = sc.nextLine().toLowerCase();
        if(loai.equalsIgnoreCase("sach"))
        {
            for (int i = 0; i < danhSachTaiLieu.size(); i++) {
                if(danhSachTaiLieu.get(i) instanceof Sach == true)
                {
                    danhSachTaiLieu.get(i).xuatInfo();
                }
            }
        }
        else if(loai.equalsIgnoreCase("tap chi"))
        {
            for (int i = 0; i < danhSachTaiLieu.size(); i++) {
                if(danhSachTaiLieu.get(i) instanceof TapChi == true)
                {
                    danhSachTaiLieu.get(i).xuatInfo();
                }
            }
        }
        else
        if(loai.equalsIgnoreCase("bao"))
        {
            for (int i = 0; i < danhSachTaiLieu.size(); i++) {
                if(danhSachTaiLieu.get(i) instanceof Bao == true)
                {
                    danhSachTaiLieu.get(i).xuatInfo();
                }
            }
        }

    }
}
