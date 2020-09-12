package Buoi3Mang2Chieu;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void nhapMang(int[][] arr,int soDong, int soCot) {

        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("a[%d][%d]=", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void xuatMang(int[][] arr,int soDong, int soCot) {
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int soDong = 3;
        int soCot= 3;
        // khai báo
        int[][] arr = new int[soDong][soCot];

        //nhập xuất 2 mảng 2 chiều
        nhapMang(arr,soDong,soCot);
        xuatMang(arr,soDong,soCot);
    }
}
