import java.util.HashSet;
import java.util.Set;

class LinkedList {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public Node mergeTwoSortedLinkedList(Node list1, Node list2) {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while (true) {
            if(list1 == null)
            {
                tail.next = list1;
                break;
            }
            if(list2 == null)
            {
                tail.next = list2;
                break;
            }
            if (list1.value <= list2.value) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        // Creating a linked list
        list1.addToTheLast(new Node(1));
        list1.addToTheLast(new Node(2));
        list1.addToTheLast(new Node(5));
        list1.addToTheLast(new Node(9));

        LinkedList list2 = new LinkedList();

        list2.addToTheLast(new Node(4));
        list2.addToTheLast(new Node(7));
        list2.addToTheLast(new Node(8));
        list2.addToTheLast(new Node(11));
        Node result = list1.mergeTwoSortedLinkedList(list1.head, list2.head);
//        Node result = list1.remove();
        System.out.println();

//        Node startNode=list.findStartNodeOfTheLoop();
//        if(startNode!=null)
//            System.out.println("start Node of loop is "+ startNode.value);
    }
}
 