class Node{
    int data;
    Node next;

     //constructor
        Node(int p){
            this.data=p;
        }
    }

public class linklist{
    public static void main(String[] args) {
    Node head = new Node(1);
    Node n1 = new Node(2);
    head.next=n1;
    Node n2 = new Node(3);
    n1.next = n2;
    Node n3 = new Node(4);
    n2.next = n3;
    n3.next=null;

    Node temp = head;
    while(temp.next!=null){
        System.out.println(temp.data);
        temp =temp.next;
    
    }
    int val = 3;
    Node biru = head;
    while(biru!=null){
        if(biru.data==val){
        System.out.println("YES VALUE IS PRESENT");
        }else{
            System.out.println("NO");
        }
        biru = biru.next;
    }
    }
}
