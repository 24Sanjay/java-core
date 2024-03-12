package com.learning.core.day7;
import java.util.Stack;

public class D07P05 {
    public static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element from the stack
            int temp = stack.pop();
            // Recur for the remaining elements in the stack
            reverse(stack);
            // Insert the popped element at the bottom of the stack
            insertAtBottom(stack, temp);
        }
    }

    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            // Pop all elements from the stack and store them in function call stack
            int temp = stack.pop();
            // Recur to insert the item at the bottom
            insertAtBottom(stack, item);
            // Push all the elements back onto the stack
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println( stack);

        // Reverse the stack
        reverse(stack);

        System.out.println( stack);
    }
}
