package com.TeamWare;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{

    Queue q;
    int size=0;
    StackUsingQueue(int size){
        q=new LinkedList();
        this.size=size;
    }

    public void push(int num){
        if(q.size()==size){
            System.out.println("Stack is Full");
            return;
        }
        q.add(num);
        for (int i=0;i<q.size()-1;i++){
            q.add(q.poll());
        }
    }

    public void pop(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        q.poll();
    }

    public int top() {
        if (!q.isEmpty()) {
            return (int) q.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }


    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Top element: " + stack.top());

        stack.pop();
        System.out.println("Top element after pop: " + stack.top());

        System.out.println("Is stack empty? " + stack.empty());
    }
}
