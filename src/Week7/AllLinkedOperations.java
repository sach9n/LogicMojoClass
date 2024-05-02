package Week7;

public class AllLinkedOperations {

    static class Node {
        int data ;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        // Traversing the Node simple Approcah
        static void iterate(Node head){
            while(head!= null){
                System.out.print(head.data+ ">");
                head = head.next;
            }
            System.out.println("\n---------------------****************-------------------");
        }

        static void iterateRecursive(Node head){
            if(head == null){
                return;
            }
            System.out.print(head.data + " > ");

            iterateRecursive(head.next);

        }

        //searching the Element

       static void GetNode(Node head , int target){
            while(head!=null){
                if(head.data == target){
                    System.out.println("\nFound");
                   return;
                }
                head = head.next;
            }
            System.out.println("Node Not Found");
        }

        // Get the Size of the Linked List
        static void GetSizeOF(Node head){
            int count = 0;
            while(head!=null){
                count++;
                head = head.next;
            }
            System.out.println(count + " Number of nodes are Present");
        }

        // addingTheElements start
        static void Startadd(Node head,int val) {
            System.out.println("\nBefore");
            iterate(head);
            Node nextNode = new Node(val);
             nextNode.next = head;
             head = nextNode;
             System.out.println("\nAfter");
             iterate(head);

        }

        static void AddAtEnd(Node head,int val) {
            System.out.println("\nBefore Adding");
            iterate(head);
            Node tempNode  = head;

            while(tempNode.next!= null){
                tempNode = tempNode.next;

             }

             tempNode.next = new Node(val);

            System.out.println("\nAfter Adding");
            iterate(head);

        }

        static void AddInbetween(Node prev ,int num){
            Node nextNode = new Node(num);
            nextNode.next = prev.next; // Go as number 40> 50 = 90> 50
            prev.next = nextNode; // 40>90;
        }

          // 3.next=>4
        // 1,2,3.next =>6.next=>4,5

        static void RotateList(Node head){
             Node prev = null;
             Node curr= head;
             Node nextNode ;

             while (curr!= null){
                 nextNode = curr.next;
                 curr.next = prev;
                 prev = curr;
                 curr = nextNode;
                 System.out.print(prev.data);
             }

        }
        static void deletionOperations(Node head, int key) {
            System.out.println("iteration Before Deletion");
            iterate(head);
            if (head == null) {  // Check for empty list (optional)
                System.out.println("List is empty");
                return;
            }

            if (head.data == key && head != null) {  // Head node deletion
                head = head.next;
                return;
            }

            Node curr = head;
            Node prev = null;

            while (curr != null && curr.data != key) {
                prev = curr;
                curr = curr.next;
            }

            if (curr == null) {
                System.out.println("Not found");
            } else {
                prev.next = curr.next;
            }

            System.out.print("Iteration After Deletion" + head.data);
            System.out.println();
            iterate(head);
        }

//        static Node  RotateKth(Node head,int k){
//            // Edges cases
//            if(head == null || k ==0){
//                return head;
//            }
//
//            Node curr = head;
//            int count = 1;
//            while(count < k && curr!= null){
//                curr = curr.next;
//                count++;
//            }
//            if(curr == null){
//                return head;
//            }
//
//            while(curr!=null)
//                curr = curr.next;
//
//            Node KthNode = curr;
//
//            }


        }
        public static void main(String[] args) {
            Node node  = new Node(10);
            Node head  = node ;

            Node n1= new Node(20);
             node.next = n1;

            Node n2= new Node(30);
            n1.next = n2;

            Node n3= new Node(40);
            n2.next = n3;

            Node n4= new Node(50);
            n3.next = n4;

//            // Iterate
//            iterate(head);
//            iterateRecursive(head);
//           // Find
//            GetNode(head,50);
//           // Get Size
//            GetSizeOF(head);
//
//            // add At start
//            Startadd(head, 1);
//
//            //addAtEnd
//            AddAtEnd(head,2);
//
//            //Add in Between
//            AddInbetween(n3,90);
//            iterate(head);
//
//            // All deletion Operation
//
//            deletionOperations(head,10);
//
//            // Rotating the LinkedList
//            RotateList(head);
//            iterate(head);
//
//            RotateKth(head,3);
        }
    }




