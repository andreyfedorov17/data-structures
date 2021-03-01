import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // System.out.println(reverse());
        // System.out.println(inToPost());
        // System.out.println(parse());
    }

    public static String getString() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static String reverse() {
        System.out.print("your string: ");
        StackReverser reverser = new StackReverser(getString());
        return "reverse string: " + reverser.reverse();
    }

    public static String inToPost() {
        System.out.println("enter infix: ");
        InToPost trans = new InToPost(getString());
        return ("postfix is " + trans.doTrans() + '\n');
    }

    public static String parse() {
        System.out.print("enter postfix: ");
        ParsePost parser = new ParsePost(getString());
        return ("evaluates to " + parser.doParse());
    }
}
