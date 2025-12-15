class myStack {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public myStack(int n) {
        capacity = n;
        stack = new int[capacity];
        top = -1; // stack is empty initially
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Inserts x at the top of the stack
    public void push(int x) {
        if (isFull()) {
            return; // stack overflow
        }
        stack[++top] = x;
    }

    // Removes an element from the top of the stack
    public void pop() {
        if (isEmpty()) {
            return; // stack underflow
        }
        top--;
    }

    // Returns the top element of the stack
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }
}
