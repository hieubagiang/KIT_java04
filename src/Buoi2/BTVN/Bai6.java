package Buoi2.BTVN;

import java.util.Scanner;



/*6. Sử dụng mảng 1 chiều nhập vào dãy số nguyên dương gồm n phần tử.
Sắp xếp lại dãy số theo dạng, nửa đầu của dãy là các số nguyên dương
theo thứ tự tăng dần, nửa sau của dãy là các số nguyên âm sắp xếp
theo thứ tự giảm dần.
INPUT: -3, 4, 6, -5, 3, 8, -2, -1
OUTPUT: 3, 4, 6, 8, -1, -2, -3, -5*/
public class Bai6 {
    static Scanner sc = new Scanner(System.in);
    static void nhapPtu(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("a["+i+"]=");
            arr[i] = sc.nextInt();
        }
    }
    static void xuatMang(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.printf("%5d",arr[i]);
        }
        System.out.println();
    }
    static void sapXepTang(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
        static void sapXepGiam(int[] a, int n) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] < a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        }
        //        ghepMang(arr,duong,am,k,j);
    static void ghepMang(int[] a, int[] duong, int[] am, int size_duong, int size_am  )
    {
        int k=0, j =0;
        for(int i=0; i<size_duong; i++)
        {
            a[i] = duong[k++];
        }
        for(int i=size_duong; i<a.length; i++)
        {
            a[i] = am[j++];
        }

    }
    static void sapXepTangGiam(int[] arr)
    {
        int[] am = new int[100];
        int[] duong = new int[100];
        int j=0,k=0;
        // tách thành 2 mảng âm và dương
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                am[j++] = arr[i];
            }
            else
            {
                duong[k++] = arr[i];
            }
        }
        System.out.println();

        // sắp xếp tăng/giảm cho mảng dương/âm
        sapXepTang(duong, k);
        sapXepGiam(am,j);

        ghepMang(arr,duong,am,k,j);
    }

    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        nhapPtu(a);
        xuatMang(a);

        sapXepTangGiam(a);
        xuatMang(a);

    }
}
