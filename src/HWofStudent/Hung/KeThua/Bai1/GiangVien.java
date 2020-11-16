package HWofStudent.Hung.KeThua.Bai1;

import java.util.Scanner;

public class GiangVien extends Nguoi{

    //Họ tên, năm sinh, quê quán, giới tính, khoa, môn học, năm kinh nghiệm.
    private String khoa;
    private String monDay;
    private int namKinhNghiem;

    public String getKhoa() {
        return khoa;
    }

    public String getMonDay() {
        return monDay;
    }

    public int getNamKinhNghiem() {
        return namKinhNghiem;
    }

    public void nhap()
    {
        System.out.println("Nhap Giang Vien: ");
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap monDay: ");
        monDay = scanner.nextLine();
        System.out.println("Nhap namKinhNghiem: ");
        namKinhNghiem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();

    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                super.toString()+
                ", khoa='" + khoa + '\'' +
                ", monDay='" + monDay + '\'' +
                ", namKinhNghiem=" + namKinhNghiem +
                '}';
    }

    public GiangVien() {
    }
}
