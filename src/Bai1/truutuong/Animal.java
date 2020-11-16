package Bai1.truutuong;

import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int population=0;

    public Animal(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("Animal"+" được gọi");
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    public int getPopulation() {
        return population;
    }

    public abstract void makeASound();

    public void introduce(){
        makeASound();
        System.out.print("toi la " + name);

        System.out.println("-----");
    }


}
