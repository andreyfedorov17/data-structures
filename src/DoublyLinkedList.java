public class DoublyLinkedList {
    private DoublyLink first;
    private DoublyLink last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayForward() {
        DoublyLink current = first;

        System.out.print("list (first-->last)");
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        DoublyLink current = last;

        System.out.print("list (last-->first): ");
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println();
    }

    public void insertFirst(long data) {
        DoublyLink newLink = new DoublyLink(data);

        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
            newLink.next = first;
        }
        first = newLink;
    }

    public void insertLast(long data) {
        DoublyLink newLink = new DoublyLink(data);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public boolean insertAfter(long key, long data) {
        DoublyLink current = first;
        DoublyLink newLink = new DoublyLink(data);

        while (current.data != key) {
            if (current == last) {
                newLink.next = null;
                last = newLink;
            } else {
                newLink.next = current.next;
                current.next.previous = newLink;
            }
            newLink.previous = current;
            current.next = newLink;
        }
        return true;
    }

    public DoublyLink deleteFirst() {
        DoublyLink temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public DoublyLink deleteLast() {
        DoublyLink temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public DoublyLink deleteKey(long key) {
        DoublyLink current = first;

        while (current.data != key) {
            current = current.next;
            if (current == first) {
                first = current.next;
            } else {
                current.next.previous = current.previous;
            }
        }
        return current;
    }
}