package SolutionPackage;
import java.util.*;

    class MyStack {
        Queue<Integer> q;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            q = new LinkedList<Integer>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            q.add(x);
            int size = q.size();
            while (size > 1) {
                int v = q.poll();
                q.add(v);
                size--;
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return q.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return q.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return q.isEmpty();
        }

        public static void main(String[] args) {
            MyStack stack = new MyStack();
            stack.push(1);
            stack.push(2);
            stack.top();
            stack.pop();
            stack.empty();
        }
    }