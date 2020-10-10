package Buoi6KeThuaLuyenTap.Bai2;

import java.util.Scanner;

public class Shipper extends Nguoi{
        private int soDonhang;
        public int tinhTien(){
            return soDonhang*30000;
        }
        void nhap(){
            super.nhap();
            Scanner sc=new Scanner(System.in);
            System.out.println("nhập số đơn đã phát :");
            soDonhang=sc.nextInt();
        }
        void xuat(){
            System.out.println(toString());
        }

        @Override
        public String toString() {
            return "Shipper{" +
                    super.toString() +
                    "sodonhang=" + soDonhang +
                    '}';
        }
        public Shipper(){

        }

        public int getSoDonhang() {
            return soDonhang;
        }

        public void setSoDonhang(int soDonhang) {
            this.soDonhang = soDonhang;
        }

}
