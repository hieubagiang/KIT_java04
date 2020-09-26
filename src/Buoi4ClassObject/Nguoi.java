package Buoi4ClassObject;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
//Nhập vào 2 người, xem ai lớn tuổi hơn
public class Nguoi {
    // ph thuộc tính
    String ten;
    int namSinh;
    String quocTich;

    // phương thức, hành động
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Nhập quốc tịch");
        quocTich = sc.nextLine();
        System.out.println("Nhập năm sinh");
        namSinh = sc.nextInt();
    }
    void noi()
    {

        System.out.println("Tên là: " + ten);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Quốc tịch: " + quocTich);
    }
}
