package HungSeTach.Bai1;

import java.util.Scanner;

public class SoPhuc {
    double phanThuc1;
    double phanAo1;
    double phanThuc2;
    double phanAo2;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc 1:");
        phanThuc1 = sc.nextDouble();
        System.out.println("Nhap phan ao 1:");
        phanAo1 = sc.nextDouble();
        System.out.println("Nhap phan thuc 2:");
        phanThuc2 = sc.nextDouble();
        System.out.println("Nhap phan ao 2:");
        phanAo2 = sc.nextDouble();

    }

    public void xuat(){
        System.out.println("So phuc thu nhat: " + phanThuc1 + " + " +phanAo1 + "i");
        System.out.println("So phuc thu hai: " + phanThuc2 + " + " + phanAo2 + "i");
    }

    public void cong(){
        double tongThuc = phanThuc1 + phanThuc2;
        double tongAo = phanAo1 + phanAo2;

        System.out.println("Tong hai so thuc: " + tongThuc + " + " + tongAo + "i");
    }

    public void tru(){
        double hieuThuc = phanThuc1 - phanThuc2;
        double hieuAo = phanAo1 - phanAo2;

        System.out.println("Hieu hai so thuc: " + hieuThuc + " + " + hieuAo + "i");
    }
}
