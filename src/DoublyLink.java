public class DoublyLink {
    public DoublyLink next;
    public DoublyLink previous;
    public long data;

    public DoublyLink(long data) {
        next = null;
        previous = null;
        this.data = data;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }
}