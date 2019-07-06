
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

    public int findBalancedNode() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.value;
            temp = temp.next;
        }

        while (head.next != null) {
            sum -= head.value;
            if (sum == head.value)
                return head.value;
            else
                head = head.next;
        }

        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    // Creating a linked list
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(10));
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(7));
        list.addToTheLast(new Node(3));
        int result = list.findBalancedNode();
        System.out.println(result);

//        Node startNode=list.findStartNodeOfTheLoop();
//        if(startNode!=null)
//            System.out.println("start Node of loop is "+ startNode.value);
    }
}
 