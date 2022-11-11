class MyQueue {
    int front;
    int rear;
    int capacity;
    int count;
    int[] queue;
    
    // constructor
    MyQueue(int _capacity) {
        front = 0;
        rear = 0;
        count = 0;
        this.capacity = _capacity;
        queue = new int[capacity];
    }
    
    // returns front element of the queue
    int top() {
        if (count == 0)
            return -1;
        return -1;
    }
    
    // deletes front element from queue
    int pop() {
        if (count == 0)
            return -1;
        int poppedEle = queue[front % capacity];
        queue[front % capacity] = Integer.MIN_VALUE;
        front++;
        count--;
        return poppedEle;
    }
    
    // return size of the queue
    int size() {
        return count;
    }
    
    // return true if queue is empty, false otherwise
    boolean isEmpty() {
        return count == 0;
    }
    
    // insert data into the queue
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
