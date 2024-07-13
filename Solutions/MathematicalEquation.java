import java.util.*;

public class UserMainCode {
    public List<String> generateAllValidEquations(String input1) {
        return addParentheses(input1);
    }

    private List<String> addParentheses(String expression) {
        List<String> result = new ArrayList<>();
        if (expression.indexOf('+') == -1 && expression.indexOf('-') == -1 &&
            expression.indexOf('*') == -1 && expression.indexOf('/') == -1) {
            result.add(expression);
            return result;
        }

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                
                List<String> leftResults = addParentheses(left);
                List<String> rightResults = addParentheses(right);
                
                for (String l : leftResults) {
                    for (String r : rightResults) {
                        result.add("(" + l + c + r + ")");
                    }
                }
            }
        }
        return result;
    }
}
