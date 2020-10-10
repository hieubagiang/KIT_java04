package Buoi6KeThuaLuyenTap.Bai2;

import java.util.Scanner;

public class NVXeOm extends Nguoi {
        private int soKm;
        public int tinhTien(){
            return soKm*30000;
        }
        void nhap(){
            super.nhap();
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập số km đã đi :");
            soKm=sc.nextInt();
        }
        void xuat(){
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Grab{" +
                    super.toString() +
                    "soKm=" + soKm +
                    '}';
        }

    public NVXeOm() {
    }

    public int getSoKm() {
            return soKm;
        }

        public void setSoKm(int soKm) {
            this.soKm = soKm;
        }

}
