package HWofStudent.Hung.KeThua.Bai2;

import java.util.Scanner;

public class TaiLieu {
    //mã tài liệu, tên tài liệu, tên nhà xuất bản
    private int maTL;
    private String tenTL;
    private String tenNXB;
    

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu : ");
        maTL = sc.nextInt();
        sc.nextLine(); // xóa '\n'
        System.out.println("Nhap ten tai lieu : ");
        tenTL = sc.nextLine();
        System.out.println("Nhap ten nha xuat ban");
        tenNXB = sc.nextLine();
    }

    public String getTenNXB() {
        return tenNXB;
    }


    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTL=" + maTL +
                ", tenTL='" + tenTL + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                '}';
    }
}