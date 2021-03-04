public class MyLinkedList {
    private Link first;

    public MyLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dData) {
        Link newLink = new Link(dData);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("list (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    public Link find(long key) {
        Link current = first;
        while (current.dData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(long key) {
        Link current = first;
        Link previous = first;

        while (current.dData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public MyListIterator getIterator() {
        return new MyListIterator(this);
    }
}
