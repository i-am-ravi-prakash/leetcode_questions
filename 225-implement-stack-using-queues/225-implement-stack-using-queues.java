class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }

        swap(q1, q2);
    }

    public void swap(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> q3 = new LinkedList<>();

        //q1 -> q3
        while (!q1.isEmpty()) {
            q3.add(q1.poll());
        }

        //q2 -> q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }

        //q3 -> q2
        while (!q3.isEmpty()) {
            q2.add(q3.poll());
        }
    }

    public int pop() {
        int poppedVal = q1.poll();
        return poppedVal;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return (q1.size() == 0);
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
