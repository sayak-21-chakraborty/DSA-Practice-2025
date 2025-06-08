package DSA.F_LinkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node y = new Node(4);
        System.out.println(y.data);
        System.out.println(y.next);
    }
}
