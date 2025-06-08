package DSA.F_LinkedList;
public class ConvertArrToLinkedList {
    public static void main(String[] args) {
        int[] arr = {12, 1, 3, 8};
        Node head = convertArrToLL(arr);
//        System.out.println(head.data);

//        traverseLL(head);

//        System.out.println(lengthOfLL(head));

//        System.out.println(checkIfPresent(head, 8));

//        System.out.println(deleteHead(head).data);

//        traverseLL(deleteTail(head));

        traverseLL(deleteKthNode(head, 4));
    }

    private static Node convertArrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void traverseLL(Node head){
        Node temp = head; // Never tamper the head
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static int lengthOfLL(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    private static int checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(val == temp.data){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }

    private static Node deleteHead(Node head){
        if(head == null) return head;

        head = head.next;
        return head;
    }

    private static Node deleteTail(Node head){
        if(head == null || head.next == null)
            return null;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deleteKthNode(Node head, int k){
        if(head == null) return head;

        if(k == 1){
            head = head.next;
            return head;
        }

        Node temp = head, prev = null;
        int count = 0;

        while(temp != null){
            count += 1;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node deleteKValueNode(Node head, int k){
        if(head == null) return head;

        if(k == 1){
            head = head.next;
            return head;
        }

        Node temp = head, prev = null;
        int count = 0;

        while(temp != null){
            count += 1;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}