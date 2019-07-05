class Stack {
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public Node pop(Node head) {
        //choose and remove last element
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        Node popNode = temp.next;
        temp.next = null;
        return popNode;

    }

    public Node peek(Node node) {
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        Node popNode = temp.next;
        return popNode;

    }

    public void push(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Stack list = new Stack();
        list.push(new Node(1));
        list.push(new Node(2));
        list.push(new Node(3));
        list.push(new Node(4));
        list.push(new Node(5));
        list.push(new Node(6));
        System.out.println(list.peek(list.head).data);
        list.printList();
    }
}