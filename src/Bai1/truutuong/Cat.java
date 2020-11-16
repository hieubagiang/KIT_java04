package Bai1.truutuong;

public class Cat extends Animal {
    public static int population=0;


    public void finalize() {
        System.out.println("finalize called");
        population--;
    }

    public Cat() {
        population++;
        System.out.println("Cat"+" được gọi");
    }

    public int getPopulation()
    {
        return population;
    }
    public Cat(String name) {
        super(name);
    }


    public void introduce(){
        super.introduce();
    }

    public void makeASound(){
        System.out.println("meomeo");
    }
}
