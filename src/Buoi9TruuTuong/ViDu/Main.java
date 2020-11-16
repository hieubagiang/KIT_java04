package Buoi9TruuTuong.ViDu;
abstract class DongVat {
    public abstract void tiengKeu();
    public void ngu() {
        System.out.println("Zzz");
    }

}
    class Cho extends DongVat{
    @Override
    public void tiengKeu()
    {
        System.out.println("Go go");
    }

    }
class Main
{
    public static void main(String[] args) {
        Cho khai = new Cho();
        khai.ngu();
        khai.tiengKeu();
    }
}