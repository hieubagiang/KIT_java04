package Buoi10.Bai2;

public class Node {
    int item;
    Node next;

    public Node() {
        next = null;
    }

    public Node(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
