package Buoi5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    ArrayList<SinhVien> listSV = new ArrayList<>();
    ArrayList<GiangVien> listGV = new ArrayList<>();

    public void nhapSinhVien()
    {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);
        }
    }
    public void nhapGiangVien()
    {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            GiangVien gv = new GiangVien();
            gv.nhap();
            listGV.add(gv);
        }
    }

    public void xuatGioiTinhNu()
    {
        System.out.println("--------Danh sách Sinh Viên nữ------");
        for (int i = 0; i < listSV.size() ; i++) {
            if(listSV.get(i).getGioiTinh().equalsIgnoreCase("nu")) {
                listSV.get(i).xuat();
            }
        }

        System.out.println("--------Danh sách Giảng Viên nữ------");
        for (int i = 0; i < listGV.size() ; i++) {
            if(listGV.get(i).getGioiTinh().equalsIgnoreCase("nu")) {
                listGV.get(i).xuat();
            }
        }
    }
}
