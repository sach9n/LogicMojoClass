package Week7;

public class InsertaionInLinkedList {
    static class Node2{
        int data;
        Node2 next = null;
        Node2(int val){
            this.data = val;
        }
    }
    public static void iterate(Node2 head){

        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    // insertion in linked list in begning
    public static void InsertAtStart(Node2 head , int val){
        System.out.println("Before Insertation iteration");
        iterate(head);

        Node2 nextNode = new Node2(val);
        nextNode.next = head;
        head = nextNode;
        System.out.println();
        System.out.println("After Insertation iteration");
        iterate(head);

    }

    public static void InsertAtAnyPosition( Node2 preNode, int val) {
        Node2 newNode = new Node2(val);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }







    // Searching an Node
    public static Node2 Search(Node2 head , int  target){
        while(head!=null){
            if(head.data == target){
                return head;
            }
            head = head.next;
        }
        return null;
    }

    public static void InsertAtEnd(Node2 head , int val){
        System.out.println("\nBefore Insertation iteration");
        iterate(head);


         Node2 tempNode = head;
        while(tempNode.next!=null){
            tempNode = tempNode.next;
        }
        tempNode.next = new Node2(val);
        System.out.println();
        System.out.println("After Insertation iteration");
        iterate(head);

    }


    public static void main(String[] args){
        Node2 node1 = new Node2(2);
        Node2 head  = node1;

        Node2 node2 = new Node2(4);
        node1.next = node2;
        Node2 node3 = new Node2(8);
        node2.next = node3;

//        InsertAtStart(head,15);
//        InsertAtEnd(head,20);
        InsertAtAnyPosition(node1,10);
        iterate(head);
    }
}
