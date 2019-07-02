
public class LinkedList {

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

    public boolean isEven(Node head) {
        boolean isEven = false;
        while (head.next != null) {
            if (head.next.next != null)
                head = head.next.next;
            else {
                isEven = true;
                break;
            }
        }

        return isEven;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
// Creating a linked list
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(9));
        list.addToTheLast(new Node(8));
//        list.addToTheLast(new Node(3));
        boolean result = list.isEven(list.head);
        System.out.println();

//        Node startNode=list.findStartNodeOfTheLoop();
//        if(startNode!=null)
//            System.out.println("start Node of loop is "+ startNode.value);
    }
}
 