package com.minhduc;

import java.util.Stack;

class MyQueue {
    Stack<Integer> mainStack;
    Stack<Integer> tempStack;

    public MyQueue() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.add(x);
    }

    public int pop() {
        if(tempStack.size()==0) {
            while(mainStack.size()>0) {
                tempStack.add(mainStack.pop());
            }
        }
        return tempStack.pop();
    }

    public int peek() {
        if(tempStack.size()==0) {
            while(mainStack.size()>0) {
                tempStack.add(mainStack.pop());
            }
        }
        return tempStack.peek();
    }

    public boolean empty() {
        return mainStack.isEmpty()&&tempStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
