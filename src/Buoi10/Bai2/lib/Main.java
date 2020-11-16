package Buoi10.Bai2.lib;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(7);
        st.push(4);

        System.out.println(st.search(2));
        System.out.println("size of stack: " + st.size());

    }
}
