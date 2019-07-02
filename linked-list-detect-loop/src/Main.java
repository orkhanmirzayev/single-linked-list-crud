class MyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private void addToLast(int newData) {
        Node newNode = new Node(newData);
        Node result = head;
        while (head.next != null) {
            head = head.next;
        }

        head.next = newNode;
        newNode.next = null;
        head = result;
    }

    public boolean isLoopDetected(Node head) {
        Node fastPtr = head;
        Node slowPtr = head;
        while (fastPtr != null &&  fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if (fastPtr == slowPtr)
                    return true;

        }

        return false;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        // Creating a linked list

        list.head=new Node(5);
        list.addToLast(6);
        list.addToLast(7);
        list.addToLast(1);
        list.addToLast(2);
        list.addToLast(7);
        // Test if loop existed or not
        System.out.println("Loop existed-->" + list.isLoopDetected(list.head));
    }
}