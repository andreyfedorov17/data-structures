public class InToPost {
    private MyStack stack;
    private final String input;
    private String output = "";

    public InToPost(String input) {
        this.input = input;
        stack = new MyStack(input.length());
    }

    public String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.displayStack("for " + c + " ");
            switch (c) {
                case '+':
                case '-':
                    gotOper(c, 1);
                    break;
                case '*':
                case '/':
                    gotOper(c, 2);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    gotParen(c);
                    break;
                default:
                    output += c;
                    break;
            }
        }

        while (!stack.isEmpty()) {
            stack.displayStack("while ");
            output += stack.pop();
        }

        stack.displayStack("end ");
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = (char) stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    stack.push(opTop);
                    break;
                } else {
                    output += opTop;
                }
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char c) {
        while (!stack.isEmpty()) {
            char ch = (char) stack.pop();
            if (ch == '(') {
                break;
            } else {
                output += ch;
            }
        }
    }
}
