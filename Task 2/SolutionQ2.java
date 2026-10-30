import java.util.Stack;

class SolutionQ2 {

    public int evalRPN(String[] array) {
        Stack<Integer> stack = new Stack<>();

        for (String i : array) {
            if (i.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (i.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (i.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (i.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(i));
            }
        }

        return stack.pop();
    }
}
