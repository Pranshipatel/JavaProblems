package list;
public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public  int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
             int val = head.data;
             head = tail = null;
             size = 0;
             return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        return val;
    }

    public int search(int key){
        Node temp = head;
        int i = 0;
        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }


    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }





    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.addFirst(1);
       ll.print();
       ll.addFirst(3);
       ll.print();
       ll.addLast(6);
       ll.print();
       ll.add(3,5);
       ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.search(6));
    }
}