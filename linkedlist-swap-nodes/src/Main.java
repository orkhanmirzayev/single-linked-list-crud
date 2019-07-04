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

    public Node swapNodes(Node head) {

        Node temp = head;
        while (head.next != null && head.next.next != null && temp!=null) {
            int first = temp.data;
            int second = temp.next.data;
            temp.data = second;
            temp.next.data = first;
            temp = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.swapNodes(list.head);
    }
}