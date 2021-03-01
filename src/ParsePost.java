public class ParsePost {
    private MyStack stack;
    private String input;

    public ParsePost(String input) {
        this.input = input;
    }

    public int doParse() {
        stack = new MyStack(20);
        char c;
        int interAns = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            stack.displayStack("" + c + " ");
            if (c >= '0' && c <= '9') {
                stack.push((int) (c - '0'));
            } else {
                num2 = (int) stack.pop();
                num1 = (int) stack.pop();
            }
            switch (c) {
                case '+':
                    interAns = num1 + num2;
                    break;
                case '-':
                    interAns = num1 - num2;
                    break;
                case '*':
                    interAns = num1 * num2;
                    break;
                case '/':
                    interAns = num1 / num2;
                    break;
                default:
                    interAns = 0;
            }
            stack.push(interAns);
        }
        interAns = (int) stack.pop();
        return interAns;
    }
}
