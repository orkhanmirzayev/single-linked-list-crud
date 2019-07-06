class Queue {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public Node dequeue(Node head) {
        //remove and return first element
        Node temp = head;
        Node newNode = temp.next;
        temp.next = null;
        this.head = newNode;
        return temp;

    }

    public void enqueue(Node node) {
        //add to end of queue
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

        Queue list = new Queue();
        list.enqueue(new Node(1));
        list.enqueue(new Node(2));
        list.enqueue(new Node(3));
        list.enqueue(new Node(4));
        list.enqueue(new Node(5));
        list.enqueue(new Node(6));
        list.printList();
        System.out.println(list.dequeue(list.head).data);
        System.out.println(list.dequeue(list.head).data);
        list.printList();

    }
}