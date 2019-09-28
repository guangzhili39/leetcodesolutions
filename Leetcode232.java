package SolutionPackage;
import java.util.*;
public class Leetcode232 {
    public static class MyQueue {
        Stack<Integer> stackpush;
        Stack<Integer> stackpop;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stackpush = new Stack<Integer>();
            stackpop = new Stack<Integer>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (stackpop.size() > 0) stackchange(stackpop, stackpush);
            stackpush.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (stackpush.size() > 0) stackchange(stackpush, stackpop);
            return stackpop.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (stackpush.size() > 0) stackchange(stackpush, stackpop);
            return stackpop.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return (stackpush.size() == 0 && stackpop.size() == 0);
        }

        private void stackchange(Stack<Integer> s1, Stack<Integer> s2) {
            while (s1.size() > 0) {
                Integer a = s1.pop();
                s2.push(a);
            }
            return;
        }
    }

    public static void main(String[] args) {
        MyQueue myq = new MyQueue();
        myq.push(1);
        myq.push(2);
        myq.push(3);
        int a = myq.pop();
        int b = myq.peek();
        boolean c = myq.empty();
        System.out.println("pop:" + a + "peek:" + b + "empty:" + c);
    }
}