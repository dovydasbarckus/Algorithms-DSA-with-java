package DSA.Stack;

public class DStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;
    public void push(int data){

        if(capacity == size())
            expendStack();
        stack[top] = data;
        top++;

    }

    private void expendStack() {
        int len = size();
        capacity *=2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack,0, len);
        stack = newStack;
    }

    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            data = stack[top];
            stack[top] = 0;
            if(size() <=(capacity/2)/2)
                shrinkStack();
        }
        return data;
    }

    private void shrinkStack() {
        int len = size();
        capacity /=2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack,0, len);
        stack = newStack;
    }

    public int peek(){
        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void show(){
        for(int s: stack){
            System.out.println(s);
        }
    }
}
