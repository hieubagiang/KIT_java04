package Buoi7DaHinh;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cha> list = new ArrayList<>();
        Cha  a = new A();

        System.out.println(a instanceof B); // a có phải là obj của class A k

        a.xuat();
        Cha b = new B();
        b.xuat();
        Cha c = new C();
        c.xuat();

        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println(list.get(0).getName());
        System.out.println(list.get(1).getName());
        System.out.println(list.get(2).getName());

    }
}
