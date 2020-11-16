package HWofStudent.Hung.HungSeTach.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHocSinh {
    ArrayList<Nguoi> quanLyHocSinh = new ArrayList<>();

    public void menu(){
        System.out.println("\t\tQuan Ly Hoc Sinh");
        System.out.println("1. Them hoc sinh moi");
        System.out.println("2. Hien thi toan bo hoc sinh");
        System.out.println("3. Hien thi hoc sinh co do tuoi muon chon");
        System.out.println("4. Hien thi so hoc sinh co que ban muon chon");
        System.out.println("5. Sap xep hoc sinh theo ten");
        System.out.println("0.Ket thuc");
        System.out.println("Ban chon :");
    }

    Scanner sc = new Scanner(System.in);

    public void nhapHocSinh(){
        int i = 1;

        while(true){
            System.out.println("Hoc sinh thu "+ i +":");
            Nguoi tmp = new HocSinh();
            tmp.nhap();
            quanLyHocSinh.add(tmp);
            i++;
            System.out.println("Nhap tiep ? (y/n)");
            String chon = sc.next();
            if(chon.equalsIgnoreCase("n")){
                break;
            }
        }
    }

    public void xuatToanBo(){
        if(quanLyHocSinh == null){
            System.out.println("Moi ban nhap hoc sinh");
        }
        else {
            int i = 1;
            for(Nguoi tmp : quanLyHocSinh){
                System.out.printf("%d .", i);
                i++;
                tmp.xuat();
            }
        }
    }

    public void hienThiHSCoDoTuoiChon(){
        System.out.println("Nhap nam sinh cua hoc sinh ban muon tim:");
        int namSinh = sc.nextInt();
        for(int i = 0 ; i < quanLyHocSinh.size() ; i++){
            if(quanLyHocSinh.get(i).namSinh == namSinh){
                quanLyHocSinh.get(i).xuat();
            }
        }
    }

    public void hienThiHSCoQueChon(){
        System.out.println("Nhap que quan cua hoc sinh ban muon tim:");
        sc.nextLine();
        String queQuan = sc.nextLine();
        for(int i = 0 ; i < quanLyHocSinh.size() ; i++){
            if(quanLyHocSinh.get(i).queQuan.equalsIgnoreCase(queQuan)){
                quanLyHocSinh.get(i).xuat();
            }
        }
    }
}
