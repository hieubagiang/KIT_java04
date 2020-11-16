package Bai1.truutuong;

public class Cow extends Animal {

    public Cow(){
        System.out.println("Cow"+" được gọi");
    }

    public Cow(String name) {
        super(name);
    }

    public void introduce(){
            super.introduce();
    }

    public void makeASound(){
        System.out.println("bo`ooooo`o`o");
    }
}
