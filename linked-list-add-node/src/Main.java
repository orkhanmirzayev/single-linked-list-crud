

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

    private static void addToLast(Node head,int newData){
        Node newNode = new Node(newData);
        while(head.next!=null){
            head = head.next;
        }

        head.next=newNode;
        newNode.next=null;

    }
    private void addNodeToFront(int newData) {
        Node node = new Node(newData);
        node.next = head;
        head = node;
    }

    private static void addNodeToMiddle(Node prevNode, int newData) {
        Node node = new Node(newData);
        Node afterNode = prevNode.next;
        prevNode.next=node;
        node.next=afterNode;
    }

    private void removeLastNode(Node head){

        Node secondLast = null;
        while(head.next.next!=null){
            head = head.next;
        }
        head.next=null;
    }

    private static void  removeNode(Node deletedNode,MyLinkedList list){
        Node head = list.head;
        while(head.next.data!=deletedNode.data){
            head=head.next;
        }

        Node node = head.next.next;
        head.next=node;
        node.next=null;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.head = new Node(1000);
        Node node1 =new Node(1001);
        Node node2 =new Node(1002);
        Node node3 =new Node(1003);
        linkedList.head.next =node1;
        node1.next=node2;
        node2.next=node3;
        addToLast(linkedList.head,1007);
//        addNodeToMiddle(node2,1006);
//
//        Node startNode = linkedList.head;
//        while (startNode.next.next!=null){
//            startNode=startNode.next;
//        }
//        startNode.next=null;

        //removeNode(node2,linkedList);
        System.out.println();
    }
}
