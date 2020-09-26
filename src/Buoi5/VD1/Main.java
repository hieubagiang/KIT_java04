package Buoi5.VD1;

public class Main {
    public static void main(String[] args) {

        TamGiac tg = new TamGiac();
        tg.setA(3);
        tg.setB(4);
        tg.setC(5);
        float chuVi = tg.getA() +tg.getB() + tg.getC();
        System.out.println(chuVi );
    }
}
