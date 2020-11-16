package Buoi10.Bai2;

import java.util.Scanner;

public class Stack {
    private Node top;
    private int size=0;

    void push(int data)
    {
        size++;
        Node p = new Node(); // khởi tạo và cấp phát 1 node
        p.setItem(data); // gán giá trị cho node
        if(size==0) // stack rỗng
        {
            top = p;
        }
        else {
            p.setNext(this.top);
            this.top=p;
        }
    }
    //•	pop( ): nếu ngăn xếp không rỗng, lấy phần tử trên đỉnh ngăn xếp ra khỏi ngăn xếp,
    // trả về giá trị của phần tử đó; nếu ngăn xếp rỗng, trả về giá trị -1.
    int pop()
    {
        if(size>0)
        {

            int data = top.item; //
            Node tmp = top;
            top=top.next;
            tmp=null; //set gia tri rong
            System.gc();
            size--;
            return data;

        }
        return -1;
    }
    //isEmpty( ): trả về giá trị true nếu ngăn xếp rỗng, ngược lại trả về false.
    boolean isEmpty()
    {
        return size==0 ? true : false;
    }
    public int numOfElement()
    {
        return size;
    }
    public int search()
    {
        int vitri=size-1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen can tim: ");
        int key = scanner.nextInt();
        for(Node i = top; i!=null; i= i.next)
        {
            vitri--;
            if(key== i.item)
            {
                return vitri;
            }
        }
        return 0;
    }
    //display( ): in ra danh sách các phần tử hiện có trong ngăn xếp.
    void display()
    {
        //duyet
        while (numOfElement()>0)
        {
            System.out.println(pop() +" ");
        }
    }

}
