package list;

public class basic_2 {
     public class Node{
         int data;
         Node next;
         public Node (int data){
             this.data = data;
             this.next = null;
         }
     }
     public Node head;
     public Node tail;

     public void addFirst(int data){
         Node newNode = new Node(data);
         if(head == null){
             head = tail = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
     }
     public void addLast(int data){
         Node newNode = new Node(data);
         if(head == null){
             head = tail = newNode;
             return;
         }
         tail.next = head;
         tail = head;
     }

     public void add(int index , int data){

         if(index == 0){
             addFirst(data);
             return;
         }
         Node newNode = new Node(data);
         Node temp = head;
         int i =0;
         while(i<index-1){
             temp = temp.next;
             i++;
         }
         newNode.next = temp.next;
         temp.next = newNode;
     }
     public void print(){
         Node current = head;
         if(current != null){
             System.out.print(current.data + " -> ");
             current = current.next;
         }
         System.out.println("null");
     }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(34);
        ll.print();
        System.out.println();
        ll.addLast(66);
        ll.print();
        System.out.println();
        ll.add(2,4);
        ll.print();
    }
}
