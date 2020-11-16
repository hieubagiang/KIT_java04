package HWofStudent.Hung.KeThua.Bai1;

import java.util.Scanner;

public class Nguoi {
//    Họ tên, năm sinh, quê quán, giới tính
    private String hoTen;
    private int namSinh;
    private String queQuan;
    private String gioiTinh;


    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hoTen: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap nam Sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // xóa '\n'
        System.out.println("Nhap queQuan: ");
        queQuan = scanner.nextLine();
        System.out.println("Nhap gioiTinh: ");
        gioiTinh = scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                        ", namSinh=" + namSinh +
                        ", queQuan='" + queQuan + '\'' +
                        ", gioiTinh='" + gioiTinh;
    }
}
