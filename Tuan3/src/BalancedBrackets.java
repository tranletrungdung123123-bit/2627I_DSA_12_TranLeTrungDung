import java.util.Stack;

public class BalancedBrackets {

    public static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char kyTu : s.toCharArray()) {

            if (kyTu == '(' || kyTu == '[' || kyTu == '{') {
                stack.push(kyTu);
            }
            else {

                if (stack.isEmpty()) {
                    return "NO";
                }

                char dauTrenCung = stack.pop();

                if (kyTu == ')' && dauTrenCung != '(') {
                    return "NO";
                }

                if (kyTu == ']' && dauTrenCung != '[') {
                    return "NO";
                }

                if (kyTu == '}' && dauTrenCung != '{') {
                    return "NO";
                }
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {

        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("((("));
    }
}