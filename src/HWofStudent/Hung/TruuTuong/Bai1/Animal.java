package HWofStudent.Hung.TruuTuong.Bai1;

import java.util.Scanner;

abstract class Animal {
    private String name;

    public abstract void makeASoud();

    public void introduce() {
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is ");
        name = sc.nextLine();
    }
}
