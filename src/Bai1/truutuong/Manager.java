package Bai1.truutuong;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager{
    ArrayList<Animal> catList;
    ArrayList<Animal> cowList;
    ArrayList<Animal> dogList;

    public Manager() {
        catList = new ArrayList<>();
        cowList = new ArrayList<>();
        dogList = new ArrayList<>();
    }

    public void nhapCat(){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        String choose="";
        while (true){
            if (choose.equalsIgnoreCase("n"))
                break;
            System.out.println("Nhap ten meo thu" + (++i));
            Animal cat = new Cat();
            cat.nhap();
            catList.add(cat);
            System.out.println("Nhập tiếp ? y/n");
            choose = scanner.nextLine();
        }
    }

    public void nhapCow(){
        Scanner scanner = new Scanner(System.in);
        int i =0;
        String choose="";
        while (true){
            if (choose.equalsIgnoreCase("n"))
                break;
            System.out.println("Nhap ten bo thu" + (++i));
            Animal cow = new Cow();
            cow.nhap();
            cowList.add(cow);
            System.out.println("Nhập tiếp ? y/n");
            choose = scanner.nextLine();
        }
    }

    public void nhapDog(){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        String choose="";
        while (true){
            if (choose.equalsIgnoreCase("n"))
                break;
            System.out.println("Nhap ten cho thu" + (++i));
            Animal dog = new Dog();
            dog.nhap();
            dogList.add(dog);
            System.out.println("Nhập tiếp ? y/n");
            choose = scanner.nextLine();
        }
    }

    public void xuatCat(){
        System.out.println("\t\t\tDANH SACH MEO");
        int i = 0;
        for(Animal cat : catList)
        {
            System.out.printf("%d. ", ++i);
            cat.introduce();
        }

    }

    public void xuatCow(){
        System.out.println("\t\t\tDANH SACH BO");
        int i = 0;
        for(Animal cow : cowList)
        {
            System.out.printf("%d. ", ++i);
            cow.introduce();
        }
    }

    public void xuatDog(){
        System.out.println("\t\t\tDANH SACH CHO");
        int i = 0;
        for(Animal dog : dogList)
        {
            System.out.printf("%d. ", ++i);
            dog.introduce();
        }
    }

}
