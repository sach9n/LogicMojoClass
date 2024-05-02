package Week7;

import java.util.function.Predicate;

public class addIngAValueInBetween {
    static class Node {
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    // Recursive
    public static Node reverseRecursion(Node head,Node curr,Node prev){
        curr = head.next;
        prev = curr;

        if(curr==null){
            return prev;
        }

        Node nxt = curr.next;
        prev = curr;

        return reverseRecursion(head,prev,nxt);
    }


    public static void traverse(Node head){
        while(head!= null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }

    public static void AddInBetween( Node Prv ,  int Add ){
        Node add = new Node(Add);
          add.next = Prv.next;
          Prv.next = add;
    }

    // Check the Size of the Node
    public static void Size(Node head){
        int count =  0;
        while(head!=null){
            count++;
           head = head.next;
        }

        System.out.println(count);
    }

    // Reverse the node
    public static Node ReverseNode(Node head){
        Node prev = null;
        Node curr = head;
        Node nextNode;

        while (curr != null) {
            nextNode = curr.next; // Store the next node
            curr.next = prev;     // Reverse the current node's pointer
            prev = curr;          // Move pointers one position ahead
            curr = nextNode;
        }

        // After the loop, 'prev' will point to the new head of the reversed list

        return prev;
    }

    //Deletion of the Operation

    public static Node Delete(Node head ,int Key){
        if(head!= null && head.data == Key){
            head = head.next;
            return head;
        }

        Node curr = head;
        Node prev = null;

        while(curr!=null && curr.data!=Key){
            prev = curr;
            curr = curr.next;

        }

        if(curr == null){
            System.out.println("Not Found");
            return head;
        }

        prev.next = curr.next;
        return head;
    }



    public static void main(String[] args) {
        Node node = new Node(3);
        Node head = node;

        Node node1 = new Node(6);
        node.next  = node1;

        Node node2 = new Node(9);
        node1.next = node2;

        Node node3 = new Node(12);
        node2.next  = node3;

        Node node4 = new Node(15);
        node3.next = node4;

       traverse(head);
       AddInBetween(node2,10);
        System.out.println(" -------------------");
        traverse(head);
        Size(head);

        System.out.println(" -----DELETEING........");
        Delete(head,3);
        traverse(head);

        System.out.println(" Reversing ........");
        ReverseNode(head);
        traverse(head);


//        reverseRecursion(head,null,null);
//        traverse(head);
    }
}
