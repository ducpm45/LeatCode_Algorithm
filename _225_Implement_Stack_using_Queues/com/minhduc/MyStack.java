package com.minhduc;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a last-in-first-out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means that only push to back,
 * peek/pop from front, size and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively.
 * You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's
 * standard operations.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 2, 2, false]
 * <p>
 * Explanation
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // return 2
 * myStack.pop(); // return 2
 * myStack.empty(); // return False
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= x <= 9
 * At most 100 calls will be made to push, pop, top, and empty.
 * All the calls to pop and top are valid.
 * <p>
 * <p>
 * Follow-up: Can you implement the stack using only one queue?
 */
public class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        int value = -1;
        while (!q1.isEmpty()) {
            if (q1.size() == 1) {
                value = q1.remove();
            } else {
                q2.add(q1.remove());
            }
        }
        Queue<Integer> temp = new LinkedList<>();
        q1 = q2;
        q2 = temp;
        return value;
    }

    public int top() {
        Object[] arr = q1.toArray();
        return (int) arr[arr.length - 1];
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
