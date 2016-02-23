package dcll.DCLL_TP2;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by QYL on 2016/2/23.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> stack=new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item)stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item)stack.pop();
    }
}
