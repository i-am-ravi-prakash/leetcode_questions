class MyQueue {
    int front;
    int rear;
    int capacity;
    int count;
    int[] queue;
    
    MyQueue(int _capacity) {
        front = 0;
        rear = 0;
        count = 0;
        this.capacity = _capacity;
        queue = new int[capacity];
    }
    
    int top() {
        if (count == 0)
            return -1;
        return -1;
    }
    
    int pop() {
        if (count == 0)
            return -1;
        int poppedEle = queue[front % capacity];
        queue[front % capacity] = Integer.MIN_VALUE;
        front++;
        count--;
        return poppedEle;
    }
    
    int size() {
        return count;
    }
    
    boolean isEmpty() {
        return count == 0;
    }
    
    void push(int a) {
        if (count == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear % capacity] = a;
        rear++;
        count++;
    }
}
