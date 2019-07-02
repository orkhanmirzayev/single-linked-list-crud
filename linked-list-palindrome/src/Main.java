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
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            if (fastPointer != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer;
    }


    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.head = new Node(1);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(4));
        System.out.println(list.isPalindrome(list.head));

    }

    public Node reverseLinkedList(Node current) {
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {
        if (head == null)
            return false;

        Node middleNode = findMiddle(head);
        Node reversedSecondPart = reverseLinkedList(middleNode.next);
        boolean isPalindrome = true;
        while (head!=null && reversedSecondPart!=null) {
            if(head.data == reversedSecondPart.data) {
                head = head.next;
                reversedSecondPart = reversedSecondPart.next;
            }else{
                isPalindrome=false;
                break;
            }
        }

        return isPalindrome;


    }
}