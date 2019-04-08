package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    List<SomeType> stack;

    public MyStack() {
        this.stack = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.add(i);
    }

    public SomeType peek() {

       return stack.isEmpty() ? null : stack.get(stack.size()-1);
    }

    public SomeType pop() {
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }

        SomeType st = peek();
        stack.remove(stack.size()-1);
        return st;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return stack.iterator();
    }
}
