package HWofStudent.Hung.KeThua.bai3;

import java.util.Scanner;

public class NguoiLon extends DocGia {
    private String CMND;

    public int tinhTienLamThe(){
        return soThangCoHieuLuc*10000;
    }

    public void xuat(){
        System.out.println(toString());
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap so CMND:");
        CMND = sc.nextLine();
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "NguoiLon{" + super.toString() +
                "CMND='" + CMND + '\'' +
                '}';
    }
}
