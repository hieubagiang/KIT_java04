package HWofStudent.Hung.KeThua.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<ThoSuaOngNuoc> thoSuaOngNuoclist = new ArrayList<>();
    private ArrayList<NhanVienGiaoHang> nhanVienGiaoHanglist = new ArrayList<>();
    private ArrayList<NhanVienXeOm> nhanVienXeOmlist = new ArrayList<>();

    public void menu() {
        System.out.println("\t\t\tQuan Ly He Thong");
        System.out.println("1. Nhap tho sua ong nuoc");
        System.out.println("2. Xuat tho sua ong nuoc");
        System.out.println("3. Nhap shipper");
        System.out.println("4. Xuat shipper");
        System.out.println("5. Nhap nhan vien xe om");
        System.out.println("6. Xuat nhan vien xe om");
        System.out.println("7. Tong tien");
        System.out.println("8. Xuat toan bo he thong");
        System.out.println("9. Thong ke luong giam dan");
        System.out.println("0. Exit");
        System.out.println("Ban chon :");
    }

    Scanner sc = new Scanner(System.in);

    public void nhapNhanVienOngNuoc() {
        System.out.println("Nhap so nhan vien ong nuoc:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien thu " + i + ":");
            ThoSuaOngNuoc thoSuaOngNuoc = new ThoSuaOngNuoc();
            thoSuaOngNuoc.nhap();
            thoSuaOngNuoclist.add(thoSuaOngNuoc);
        }
    }

    public void xuatNhanVienOngNuoc() {
        System.out.println("\t\t\tDanh sach tho sua la:");
        for (int i = 0; i < thoSuaOngNuoclist.size(); i++) {
            System.out.println((i + 1) + " .");
            thoSuaOngNuoclist.get(i).xuat();
        }
    }

    public void nhapNhanVienShipper() {
        System.out.println("Nhap so nhan vien shipper:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVienGiaoHang nhanVienGiaoHang = new NhanVienGiaoHang();
            nhanVienGiaoHang.nhap();
            nhanVienGiaoHanglist.add(nhanVienGiaoHang);
        }
    }

    public void xuatNhanVienGiaoHang() {
        System.out.println("\t\t\tDanh sach nhan vien giao hang");
        for (int i = 0; i < nhanVienGiaoHanglist.size(); i++) {
            System.out.println((i + 1) + " .");
            nhanVienGiaoHanglist.get(i).xuat();
        }
    }

    public void nhapNhanVienXeOm() {
        System.out.println("Nhap so luong nhan vien xe om:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            NhanVienXeOm nhanVienXeOm = new NhanVienXeOm();
            nhanVienXeOm.nhap();
            nhanVienXeOmlist.add(nhanVienXeOm);
        }
    }

    public void xuatNhanVienXeOm() {
        System.out.println("\t\t\tDanh sach nhan vien xe om");
        for (int i = 0; i < nhanVienXeOmlist.size(); i++) {
            System.out.println((i + 1) + " . ");
            nhanVienXeOmlist.get(i).xuat();
        }
    }

    public void tongTien() {
        int tongTienNVOngNuoc = 0;
        int tongTienNVGiaoHang = 0;
        int tongTienNVXeOm = 0;

        for (ThoSuaOngNuoc tmp : thoSuaOngNuoclist) {
            tongTienNVOngNuoc += tmp.luong();
            System.out.println("Tong tien cua tho sua ong nuoc: " + tongTienNVOngNuoc);
        }

        for (NhanVienGiaoHang tmp : nhanVienGiaoHanglist) {
            tongTienNVGiaoHang += tmp.luong();
            System.out.println("Tong tien nhan vien giao hang: " + tongTienNVGiaoHang);
        }

        for (NhanVienXeOm tmp : nhanVienXeOmlist) {
            tongTienNVXeOm += tmp.luong();
            System.out.println("Tong tien nhan vien xe om: " + tongTienNVXeOm);
        }

        System.out.println("Tong tien luong la : " + (tongTienNVGiaoHang + tongTienNVOngNuoc + tongTienNVXeOm));
    }

    public void sapXepNVOngNuocGiamDan() {
        for (int i = 0; i < thoSuaOngNuoclist.size() - 1; i++) {
            for (int j = i + 1; j < nhanVienGiaoHanglist.size(); j++) {
                if (thoSuaOngNuoclist.get(j).luong() < thoSuaOngNuoclist.get(i).luong()) {
                    ThoSuaOngNuoc tmp;
                    tmp = thoSuaOngNuoclist.get(i);
                    thoSuaOngNuoclist.set(i, thoSuaOngNuoclist.get(j));
                    thoSuaOngNuoclist.set(j, tmp);
                }
            }
        }
    }

    public void sapXepNVGiaoHangGiamDan() {
        for (int i = 0; i < nhanVienGiaoHanglist.size() - 1; i++) {
            for (int j = i + 1; j < nhanVienGiaoHanglist.size(); j++) {
                if (nhanVienGiaoHanglist.get(j).luong() < nhanVienGiaoHanglist.get(i).luong()) {
                    NhanVienGiaoHang tmp;
                    tmp = nhanVienGiaoHanglist.get(i);
                    nhanVienGiaoHanglist.set(i, nhanVienGiaoHanglist.get(j));
                    nhanVienGiaoHanglist.set(j, tmp);
                }
            }
        }
    }

        public void sapXepNVXeOmGiamDan() {
            for (int i = 0; i < nhanVienXeOmlist.size() - 1; i++) {
                for (int j = i + 1; j < nhanVienXeOmlist.size(); j++) {
                    if (nhanVienXeOmlist.get(j).luong() < nhanVienXeOmlist.get(i).luong()) {
                        NhanVienXeOm tmp;
                        tmp = nhanVienXeOmlist.get(i);
                        nhanVienXeOmlist.set(i, nhanVienXeOmlist.get(j));
                        nhanVienXeOmlist.set(j, tmp);
                    }
                }
            }
        }
        public void thongKeNhanVienGiamDan(){
            System.out.println("Nhan vien ong nuoc : ");
            sapXepNVOngNuocGiamDan();
            for(ThoSuaOngNuoc tmp : thoSuaOngNuoclist){
                tmp.xuat();
            }

            System.out.println("Nhan vien giao hang: ");
            sapXepNVGiaoHangGiamDan();
            for(NhanVienGiaoHang tmp : nhanVienGiaoHanglist){
                tmp.xuat();
            }

            System.out.println("Nhan vien xe om:" );
            sapXepNVXeOmGiamDan();
            for(NhanVienXeOm tmp : nhanVienXeOmlist){
                tmp.xuat();
            }
        }
}





