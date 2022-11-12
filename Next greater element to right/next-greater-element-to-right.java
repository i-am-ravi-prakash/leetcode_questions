public static int[] nextLargerElement(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            int nge = -1;
            int curr = arr[i];
            if (stack.isEmpty()) {
                nge = -1;
            } else if (!stack.isEmpty() && stack.peek() > curr) {
                nge = stack.peek();
            } else if (!stack.isEmpty() && stack.peek() <= curr) {
                while (!stack.isEmpty() && stack.peek() <= curr) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    nge = -1;
                } else {
                    nge = stack.peek();
                }
            }
            result[i] = nge;
            stack.push(curr);
        }
        return result;
    }
