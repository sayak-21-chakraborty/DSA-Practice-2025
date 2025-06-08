package DSA.G_DoubleLinkedList;

public class ConvertArrToDLL {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};
        DL_Node head = convertArrToDLL(arr);
//        head = deleteHeadOfDLL(head);
//        head = deleteTailOfDLL(head);
        printDLL(head);
        head = deleteKthNodeOfDLL(head, 4);
        printDLL(head);
//        System.out.println(head.data);
//        System.out.println(head.next);
//        System.out.println(head.back);
    }

    private static DL_Node convertArrToDLL(int[] arr){
        DL_Node head = new DL_Node(arr[0]);
        DL_Node prev = head;

        for(int i = 1; i < arr.length; i++){
            DL_Node temp = new DL_Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void printDLL(DL_Node head){
        if(head == null)
            System.out.println("Empty");

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

//    Deletion of Node from Double Linked List
//    1. Head
//    2. Tail
//    3. Kth Node
//    4. K Value Node

    private static DL_Node deleteHeadOfDLL(DL_Node head){
        if(head == null || head.next == null) {
            return null;
        }
        DL_Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    private static DL_Node deleteTailOfDLL(DL_Node head){
        if(head == null || head.next == null){
            return null;
        }
        DL_Node tail = head;
        while(tail.next != null)
            tail = tail.next;

        tail.back.next = null;
        tail.back = null;

        return head;
    }

    private static DL_Node deleteKthNodeOfDLL(DL_Node head, int k){
        if(head == null)
            return null;

        if(k == 1){
            head = head.next;
            head.back = null;
        }

        int count = 0;
        DL_Node temp = head;
        while(temp != null){
            count += 1;

            if(count == k){
                if(temp.next == null){
                    temp.back.next = null;
                } else {
                    temp.back.next = temp.next;
                    temp.next.back = temp.back;
                }
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}