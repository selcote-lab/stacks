package com.tonasolution;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("ali", "ahmed", 1223));
        stack.push(new Employee("Marie", "Smith", 1293));
        stack.push(new Employee("casu", "lala", 1273));

        stack.print();

        System.out.println("Peek item ->");
        System.out.println(stack.peek());
        stack.print();

        System.out.println("Pop item ->");
        stack.pop();
        stack.print();

    }
}
