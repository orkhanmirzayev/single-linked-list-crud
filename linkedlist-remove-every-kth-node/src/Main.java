import java.util.HashSet;
import java.util.Set;

class MyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    public Node removeKthNode(int k) {
        Node temp = head;
        int count = 1;
        if(k==count)
            return null;
        while (temp != null && temp.next.next!=null && count < k) {
            if(count+1==k){
                temp.next=temp.next.next;
                count=0;
                continue;
            }
            temp = temp.next;
            count++;


        }
        return head;
    }

    public void printList() {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(8));
        list.removeKthNode(3);
        list.printList();
    }
}