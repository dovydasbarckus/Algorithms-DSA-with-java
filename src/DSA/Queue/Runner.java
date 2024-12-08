package DSA.Queue;

public class Runner
{
    public static void main(String[] args){
        Queue q = new Queue();
        q.enQueue(7);
        q.enQueue(13);
        q.enQueue(9);
        q.enQueue(15);
        q.enQueue(19);
        q.showQueue();
        System.out.println("Size: " + q.getSize());

        int deQueuedItem = q.deQueue();
        System.out.println("DeQueuedItem: " + deQueuedItem);

        q.enQueue(1);
        q.showQueue();
        System.out.println();
        System.out.println("Is empty?: " + q.isEmpty());
        System.out.println("Size: " + q.getSize());
    }
}
