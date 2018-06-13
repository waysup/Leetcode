import java.util.Stack;

public class Valid_Parentheses {

    public static void main(String[] args) {

        Valid_Parentheses solver = new Valid_Parentheses();
        System.out.println(solver.isValid("()"));
        System.out.println(solver.isValid("()[]{}"));
        System.out.println(solver.isValid("]"));
    }

    public boolean isValid(String s) {
        Stack<Character> parenStack = new Stack<>();

        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    parenStack.push(chars[i]);
                    break;
                case ')':
                    if (!parenStack.empty() && parenStack.peek() == '(')
                        parenStack.pop();
                    else return false;
                    break;
                case '}':
                    if (!parenStack.empty() && parenStack.peek() == '{')
                        parenStack.pop();
                    else return false;
                    break;
                case ']':
                    if (!parenStack.empty() && parenStack.peek() == '[')
                        parenStack.pop();
                    else return false;
                    break;
            }
            i++;
        }
        return parenStack.empty();

    }
}
