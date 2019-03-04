package com.mateacademy.collections;

public class TestCollections {

    public static void main(String[] args) {
        MyArrayList<String> myArrayList= new MyArrayList<>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyStack<String> myStack = new MyStack<>(4);

        System.out.println("ArrayList:");
        myArrayList.add("First");
        myArrayList.add("Second");
        myArrayList.add("Third");
        System.out.println(myArrayList.size());
        myArrayList.remove(2);
        System.out.println(myArrayList.get(1));
        myArrayList.add("Fourth");
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.size());

        System.out.println("LinkedList:");
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println(myLinkedList.size());
        myLinkedList.clear();
        System.out.println(myLinkedList.size());

        System.out.println("Stack:");
        myStack.push("FirstStack");
        myStack.push("SecondStack");
        myStack.push("ThirdStack");
        System.out.println(myStack.peek());
        myStack.remove();
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        myStack.push("FourthStack");
        System.out.println(myStack.size());
    }
}
