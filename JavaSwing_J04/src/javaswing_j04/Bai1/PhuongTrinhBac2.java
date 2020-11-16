/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing_j04.Bai1;

/**
 *
 * @author PhamDoanHieu
 */
public class PhuongTrinhBac2 {

    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public String giaiPT() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Phương trình vô số nghiệm";
                } else {
                    return "Phương trình vô nghiệm";
                }
            } else // bx = -c
            {
                return ""+(-c / b);
            }
        } else//ax^2 + bx  + c = 0
        {
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) { 
                return "Phương trình vô nghiệm";
            }
            
            else if(delta ==0)
            {
                return "Phương trình có nghiệm kép x= " + -b/2/a;

            }
            else
            {
                return "X1= " + (-b+ Math.sqrt(delta))/2/a +
                        ", X2 = " + (-b- Math.sqrt(delta))/2/a;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(new PhuongTrinhBac2(1, 5, 6).giaiPT());
    }
}
