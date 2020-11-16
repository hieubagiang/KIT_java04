/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing_j04.cau1;

import java.io.Serializable;

/**
 *
 * @author PhamDoanHieu
 */
public class SinhVienHTTT extends SinhVien  {
    private double hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT(double hocPhi, String maSV, String hoTen, String ngaySinh, String gioiTinh, double diem) {
        super(maSV, hoTen, ngaySinh, gioiTinh, diem);
        this.hocPhi = hocPhi;
    }

    

    public double getHocPhi() {
        return hocPhi;
    }
    
    
    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return "SinhVienHTTT{" + super.toString()+", hocPhi=" + hocPhi + '}';
    }

    void xuat() {
        System.out.println(toString());
    }

   
    
    
}