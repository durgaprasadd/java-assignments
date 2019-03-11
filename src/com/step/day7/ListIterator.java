package com.step.day7;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
    private List givenList;
    private static int index = 0;

    public ListIterator(List givenList) {
        this.givenList = givenList;
    }

    public boolean hasNext(){
        return this.givenList.size() > this.index;
    }

    public int next(){
        if(this.hasNext()){
            return (int) this.givenList.get(index++);
        }
        throw new NoSuchElementException("there is no element");
    }
}
