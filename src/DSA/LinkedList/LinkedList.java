package DSA.LinkedList;


public class LinkedList{

    Node head;

    public void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            if (head.data == node.data){
                System.out.println("This is Head, Node value: "+ node.data + " Node referring to: " + node.next.data);
                node = node.next;
            }
            else{
                System.out.println("Node value: "+ node.data + " Node referring to: " + node.next.data);
                node = node.next;
            }
        }
        System.out.println("Node value: "+ node.data + " Node referring to: " + node.next);
    }

    public void insertAtStart(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index==0){
            insertAtStart(data);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){

        if(index==0){
            head = head.next;
        }
        else{
            Node n = head;
            Node nReference = null;
            for(int i=0; i<index-1;i++){
                n = n.next;
            }
            nReference = n.next;
            n.next = nReference.next;
            nReference = null;
        }
    }
}
