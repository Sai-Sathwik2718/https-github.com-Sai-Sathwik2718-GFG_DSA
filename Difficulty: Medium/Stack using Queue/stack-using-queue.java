import java.util.*;

class myStack {

    Queue<Integer> q;

    public myStack() {
        q = new LinkedList<>();
    }

    // Push element x onto stack
    void push(int x) {
        q.add(x);
        int size = q.size();
        // Rotate the queue to bring x to front
        for (int i = 1; i < size; i++) {
            q.add(q.poll());
        }
    }

    // Removes the element on top of the stack
    void pop() {
        if (!q.isEmpty()) {
            q.poll();
        }
    }

    // Get the top element
    int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }

    // Returns the size of the stack
    int size() {
        return q.size();
    }
}
