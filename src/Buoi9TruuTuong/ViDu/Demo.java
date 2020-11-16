package Buoi9TruuTuong.ViDu;

class Shape {
    public Shape() {
        draw();
    }
    public void draw() {}
}
class Point extends Shape {
    protected int x, y;
    public Point(int xx, int yy) {
        draw();
        x = xx; y = yy;
        draw();
    }
    public void draw() {
        System.out.println("(" + x + "," + y + ")");
    }
}
public class Demo {
    public static void main(String args[]){
        Point p  = new Point(5,5);

    }
}