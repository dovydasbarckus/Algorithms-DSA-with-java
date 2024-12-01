package DSA.LinkedList;

public class Runner {
    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(18);
        list.insert(15);
        list.insert(3);
        list.insert(9);
        list.insert(25);
        list.insertAtStart(1);
        list.insertAt(2,55);
        list.insertAt(0, -1);
        list.deleteAt(2);
        list.show();

    }
}
