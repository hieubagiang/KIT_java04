package HWofStudent.Hung.TruuTuong.Bai1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.introduce();
        cat.makeASoud();

        System.out.println();

        Animal cow = new Cow();
        cow.introduce();
        cow.makeASoud();

        System.out.println();

        Animal dog = new Dog();
        dog.introduce();
        dog.makeASoud();
        }
    }
