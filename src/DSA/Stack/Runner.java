package DSA.Stack;

public class Runner {

    public static void main(String[] args){
//        Stack nums = new Stack();
//        nums.push(1);
//        nums.push(5);
//        nums.push(11);
//        nums.push(3);
//        nums.push(17);
//        nums.push(100);
//        nums.show();
//        System.out.println("Peeked item: " + nums.peek());
//        System.out.println("Poped item: " + nums.pop());
//        System.out.println("Peeked item: " + nums.peek());
//        System.out.println("Size is : " + nums.size());
//        System.out.println("Is empty? : " + nums.isEmpty());

        DStack dStack = new DStack();
        dStack.push(1);
        dStack.push(2);
        dStack.push(3);
        dStack.push(4);
        dStack.push(5);
        dStack.show();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.pop();
        dStack.show();
        System.out.println("Size is : " + dStack.size());
    }

}
