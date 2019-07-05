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

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public Node swapNodes(Node head, int k) {

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (current != null && count < k) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        if (next != null)
            head.next = swapNodes(next, k);
        return prev;
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.head= list.swapNodes(list.head,3);
        list.printList();
    }
}