package Buoi4ClassObject.Bai1;

import java.util.Scanner;

public class PhanSo {
    /*

    - public
    - private
    - protected
    - default
     */
   private int tuSo;
   private  int mauSo;
   // ho ten, ngay sinh, que quan, diem. ...

   // hàm tạo dụng

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo()
   {
       mauSo = 0;
       tuSo = 0;

   }
    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public
    void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap tuSo");
        tuSo = sc.nextInt();
        System.out.println("nhap mauSo");
        mauSo = sc.nextInt();
    }
    void xuat()
    {
        System.out.println(tuSo + "/" + mauSo);
    }
    int UCLN() {
        int ucln=0;
        int min = tuSo<mauSo ? tuSo : mauSo;
        for(int i= min ;i>=0; i--)
        {
            if(tuSo%i == 0 && mauSo %i ==0)
            {
                ucln = i;
                break;
            }
        }
        return ucln;
    }
    void rutGon()
    {
        int ucln = UCLN();
        tuSo = tuSo/ucln;
        mauSo = mauSo/ucln;
    }



    void congPhanSo(PhanSo ps)
    {
        PhanSo cong = new PhanSo();
        cong.tuSo = this.tuSo* ps.mauSo + ps.tuSo*this.mauSo;
        cong.mauSo = this.mauSo*ps.mauSo;
        cong.rutGon();
        cong.xuat();
    }
}
