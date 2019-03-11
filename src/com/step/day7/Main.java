package com.step.day7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        ListIterator listIterator = new ListIterator(numbers);
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());

//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);

    }
}
