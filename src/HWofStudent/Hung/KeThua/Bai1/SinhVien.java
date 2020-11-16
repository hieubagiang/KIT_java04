package HWofStudent.Hung.KeThua.Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi{

    private String maLop;
    private String nganhHoc;
    private String khoa;

    public  void coKhaNangHocKhong(GiangVien gv)
    {
        if(nganhHoc.equalsIgnoreCase(gv.getKhoa()))
        {
            System.out.println("Co kha nang hoc cung");
        }
        else
        {
            System.out.println("Khong co kha nang");
        }
    }
    public void nhap()
    {
        //Họ tên, năm sinh, quê quán, giới tính, Mã lớp, ngành học, khoá;
        System.out.println("Nhap HocSinh");
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap maLop: ");
        maLop = scanner.nextLine();
        System.out.println("Nhap nganhHoc: ");
        nganhHoc = scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString()+
                ", maLop='" + maLop + '\'' +
                ", nganhHoc='" + nganhHoc + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }
    
}
