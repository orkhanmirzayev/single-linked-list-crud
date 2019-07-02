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

    public Node findMiddle(Node head) {
        Node slowPointer = head;
        Node fastPointer = head;
        while (fastPointer!=null ){
            fastPointer=fastPointer.next;
            if(fastPointer!=null){
               slowPointer=slowPointer.next;
               fastPointer=fastPointer.next;
            }
        }

        return slowPointer;
    }


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.head = new Node(1);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));
        list.addToTheLast(new Node(6));
        list.addToTheLast(new Node(7));
        Node middleNode = list.findMiddle(list.head);
        System.out.println();

    }
}