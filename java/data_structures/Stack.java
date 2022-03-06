

public class Stack {
    int top = 0;
    int stack[] = new int[6];
    public void push(int d){
        stack[top] = d;
        top++;
    }
    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public boolean peek(int val){
        for (int i : stack) {
            if (i == val){
                return true;
            }
        }
        return false;
        
    }
        
    public void show(){
        for (int n : stack) {
            System.out.print(n + " " );
        }
    }
    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(8);
        list.push(2);
        list.push(1);
        System.out.println(" popped lement is" + list.pop());
        System.out.println(list.peek(5));
        list.show();
    }
    
}
