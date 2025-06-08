package DSA.G_DoubleLinkedList;

public class DL_Node {
    int data;
    DL_Node next;
    DL_Node back;

    DL_Node(int data, DL_Node next, DL_Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    DL_Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
