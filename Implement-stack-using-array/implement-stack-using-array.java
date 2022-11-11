class MyStack {
    int top;
    int arr[] = new int[1000];
    
    MyStack() {
        top = -1;
    }
    
    // push an integer into the stack.
    void push(int a) {
        arr[++top] = a;
    }
    
    // removes an item from top of the stack.
    int pop() {
        int poppedEle = -1;
        if (top != -1) {
            poppedEle = arr[top];
            top--;
        }
        return poppedEle;
    }
    
    // returns size of the stack
    int size() {
        return (top + 1);
    }
    
    // returns top element of the stack
    int top() {
        return arr[top];
    }
    
    // return true if stack is empty, false otherwise
    boolean isEmpty() {
        return (top == -1);
    }
}
