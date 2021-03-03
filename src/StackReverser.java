public class StackReverser {
    private String str;

    public StackReverser(String str) {
        this.str = str;
    }

    public String reverse() {
        StringBuilder result = new StringBuilder();
        MyStack stack = new MyStack(str.length());

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            result.append((char) stack.pop());
        }

        return result.toString();
    }
}