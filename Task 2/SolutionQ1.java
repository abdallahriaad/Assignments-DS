
// import java.util.Stack;
public class SolutionQ1 {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new ArrayStack<>(s.length());
        String st = arrange(s);
        char[] s_to_a = st.toCharArray();
        for (char c : s_to_a) {
            if (!stack.isEmpty() && stack.top() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        char[] result = new char[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result.length == 0 ? "NOOO ANY CHAR!!!!!!" : new String(result);
    }
// TO DO: Implement the arrange method to sort the characters in the string based on their first occurrence and frequency.
    public String arrange(String s) {
        ArrayStack<Character> stack = new ArrayStack<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (s.indexOf(current) == i) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == current) {
                        stack.push(current);
                    }
                }
            }
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return new String(result);
    }
}
