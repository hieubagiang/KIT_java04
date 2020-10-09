package Buoi6KeThuaLuyenTap.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
    ArrayList<TreEm> treEmList;
    ArrayList<NguoiLon> nguoiLonList;

    public void menu()
    {
        System.out.println("\t\t\tQUẢN LÝ THƯ VIỆN");
        System.out.println("1. Nhập độc giả trẻ em");
        System.out.println("2. Nhập độc giả người lớn");
        System.out.println("3. Xuất độc giả trẻ em");
        System.out.println("4. Xuất độc giả người lớn");
        System.out.println("5. Tính tổng tiền làm thẻ");
        System.out.println("0. Exit");
        System.out.println("Mời bạn chọn: ");
    }
    public QuanLyThuVien() {
        treEmList = new ArrayList<>();
        nguoiLonList = new ArrayList<>();
    }
    public void xuatTreEm()
    {
        System.out.println("\t\t\tDANH SACH DOC GIA TRE EM");
        for (int i = 0; i <treEmList.size() ; i++) {
            System.out.print((i+1)+ ". ");
            treEmList.get(i).xuat();
        }
    }
    public void xuatNguoiLon()
    {
        System.out.println("\t\t\tDANH SACH DOC GIA TRE EM");
        int i = 1;
        for(NguoiLon tmp : nguoiLonList)
        {
            System.out.printf("%d. ", i);
            tmp.xuat();
        }
    }

    public void nhapTreEm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số trẻ em cần nhập: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NHAP TRE EM THU " + (i + 1));
            TreEm tmp = new TreEm();
            tmp.nhap();
            treEmList.add(tmp);

        }
    }

    public void nhapNguoiLon() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String chon = "";
        while (true) {
            if (chon.equalsIgnoreCase("n"))
                break;
            System.out.println("NHAP NGUOI LON THU " + (++i));
            NguoiLon tmp = new NguoiLon();
            tmp.nhap();
            nguoiLonList.add(tmp);
            System.out.println("Nhập tiếp ? y/n");
            chon = sc.nextLine();

        }
    }

    public void tongTienLamThe() {
        int  tongTien=0;
        for(TreEm tmp : treEmList)
        {
            tongTien+=tmp.tinhTienLamThe();
        }
        for(NguoiLon tmp : nguoiLonList)
        {
            tongTien+=tmp.tinhTienLamThe();
        }
        System.out.println("Tổng tiền làm thẻ là: " + tongTien);
    }
}
