package HWofStudent.Hung.KeThua.Bai2;

public class Main {
    public static void main(String[] args) {
        Sach S = new Sach();
        TapChi TC = new TapChi();

        System.out.println("Nhap sach: ");
        S.nhap();

        System.out.println("Nhap Tap chi: ");
        TC.nhap();

        S.xuat();
        TC.xuat();

        NXB(S,TC);
    }

    static void NXB(Sach S, TapChi TC){
        if(S.getTenNXB().equalsIgnoreCase(TC.getTenNXB())){
            System.out.println("Cung nha xuat ban");
            System.out.println(S.getTenNXB());
        }
        else{
            System.out.println("Khong cung nha xuat ban");
        }
    }
}
