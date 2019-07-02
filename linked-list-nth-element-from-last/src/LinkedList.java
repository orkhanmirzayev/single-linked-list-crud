
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

    public Node findNthElementFromLast(Node head, int n) {
        //1.define fptr and sptr to head
        //2.move fptr to n-1
        //3.move fptr and sptr by 1 until sptr is equal to null
        Node firstPtr = head;
        Node secPtr = head;
        int times = n-1;
        while (firstPtr.next != null && times > 0) {
            firstPtr = firstPtr.next;
            times--;
        }
        while (firstPtr!=null && firstPtr.next!=null){
            firstPtr=firstPtr.next;
            secPtr=secPtr.next;
        }

        return secPtr;

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
        Node result = list.findNthElementFromLast(list.head,3);
        System.out.println(result.value);

//        Node startNode=list.findStartNodeOfTheLoop();
//        if(startNode!=null)
//            System.out.println("start Node of loop is "+ startNode.value);
    }
}
 