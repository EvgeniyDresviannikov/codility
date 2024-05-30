package codility.stacksandqueues;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.solution("())"));
    }
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            String item = String.valueOf(S.charAt(i));
            if (isClosedBracket(String.valueOf(S.charAt(i)))) {
                if (stack.isEmpty()) return 0;
                String top = stack.pop().toString();
                if (!top.equals(getProperBracket(item))) {
                    return 0;
                }
            } else {
                stack.add(S.charAt(i));
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    private boolean isClosedBracket(String c) {
        if (c.equals(")") || c.equals("]") || c.equals("}")) return true;

        return false;
    }

    private String getProperBracket(String c) {
        switch (c) {
            case ")": return "(";
            case "}": return "{";
            case "]": return "[";
        }
        return "";
    }
}
