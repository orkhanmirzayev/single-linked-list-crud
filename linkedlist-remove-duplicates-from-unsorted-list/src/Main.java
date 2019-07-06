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

    public Node removeDuplicates(Node head) {

        if (head == null) {
            return null;
        }
        Node tempHead = head;
        Node dummyNode = null;
        Set<Integer> set = new HashSet<>();
        while (tempHead != null) {
            if (!set.contains(tempHead.data)) {
                set.add(tempHead.data);
                dummyNode = tempHead;
            } else {
                dummyNode.next = tempHead.next;
            }
            tempHead = tempHead.next;

        }

        return head;
    }

    public void printList(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(7));
        list.removeDuplicates(list.head);
        list.printList(list.head);
    }
}