package command;

import java.util.Stack;

public class SQRT implements Cmd {

    @Override
    public Stack<Double> exec(Stack<Double> stack) {
        Double v = Math.sqrt(stack.peek());
        System.out.println("sqrt -> " + v);
        stack.push(v);
        return stack;
    }
}
