package Bai1.truutuong;


import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Cat meo = new Cat();
        meo.setName("tôm");
        Cat meo2 = new Cat();
        Cat meo5 = new Cat();
        Cat meo3 = new Cat();
        Cat meo4 = new Cat();

        System.out.println("Tổng số mèo = " + Cat.population);

        meo2 = null;
        System.gc(); //gom rác
        System.out.println("Tổng số mèo = " + Cat.population);

    }
}
