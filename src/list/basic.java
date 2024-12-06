package list;

public class basic {
    Node head;
    private int size;

    basic(){
        this.size = 0;
    }

    class  Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

//    add last
    public  void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

//    delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("this list is empty");

            return;
        }
        size--;
        head = head.next;
    }

    public  void deleteLast(){
        if(head == null){
            System.out.println("this list is empty");
            return;
        }
        size -- ;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }


//    size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
       basic list = new basic();
       list.addFirst("a");
       list.addFirst("is");
       list.printList();
       list.addLast("list");
       list.printList();
       list.addFirst("this");
       list.printList();
       list.deleteFirst();
       list.printList();
       list.deleteLast();
       list.printList();
        System.out.println(list.getSize());
    }
}
