package CS3100Project;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nathan Craig and Ti Berry
 */
public class main {

    // input.push('A');
    public static boolean checkBalance(String str) {
        Stack matchStack = new Stack();
        char[] strArray = str.toCharArray();
        for (char ch : strArray) {
            switch (ch) {
                case '{':
                case '[':
                case '(':
                case '<':
                    matchStack.push(ch);
                    break;
                case '}':
                    if (matchStack.peek().equals('{')) {
                        matchStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (matchStack.peek().equals('[')) {
                        matchStack.pop();
                    } else {
                        return false;
                    }
                    break;

                case ')':
                    if (matchStack.peek().equals('(')) {
                        matchStack.pop();
                    } else {
                        return false;
                    }
                    break;

                case '>':
                    if (matchStack.peek().equals('<')) {
                        matchStack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public void tokenizer(String str) {
        String pattern = "((((\\-)(\\+))*?\\d+(\\.\\d+)?)(==?|\\+(=|\\+)?|-(=|-)?|\\*\\*?=?|\\/\\/?=?|%=?))";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while(m.find()) {

        }

    }

    public static void main(String[] args) {
        String bobby = "(x <x>()()(())()<0>{}[()()()[{[]()<{}}({<({})>})>}]])";

        System.out.println(checkBalance(bobby));
    }
}
