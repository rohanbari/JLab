class StackArray {

    /**
     * Custom stack data-structure.
     */
    static class MyStack<T> {
        private T[] item;
        private int size;
        private int actualSize;

        @SuppressWarnings("unchecked")
        public MyStack(int size) {
            this.size = size;

            // Such a code should not be practiced unless mandatory
            item = (T[]) new Object[size];
            actualSize = 0;
        }

        /**
         * Returns if the stack is empty.
         * 
         * @return Is the stack empty?
         */
        public boolean isEmpty() {
            return actualSize == 0;
        }

        /**
         * Size of the stack.
         */
        public int size() {
            return actualSize;
        }

        /**
         * Adds an element to the end of the list.
         * 
         * @param item Item to add
         * @throws Exception Exception
         */
        public void push(T item) throws Exception {
            if (actualSize == size)
                throw new Exception("error: Overflow.");

            this.item[actualSize++] = item;
        }

        /**
         * Removes the most recent element.
         * 
         * @return Most recent element
         * @throws Exception Exception
         */
        public T pop() throws Exception {
            if (isEmpty())
                throw new Exception("error: Underflow.");

            return item[--actualSize];
        }
    }

    /**
     * Driver code.
     * 
     * @param args System arguments
     * @throws Exception Exception
     */
    public static void main(String[] args) throws Exception {
        Base.greetings();

        MyStack<Integer> stack = new MyStack<>(5);

        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(2);

        // Causes overflow!
        // stack.push(10);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Causes underflow!
        // stack.pop();
    }
}
