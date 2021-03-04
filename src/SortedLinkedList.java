public class SortedLinkedList {
    private Link first;

    public SortedLinkedList() {
        first = null;
    }

    public SortedLinkedList(Link[] links) {
        first = null;

        for (Link link : links) {
            insert(link);
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }

        newLink.next = current;
    }

    public void insert(Link link) {
        Link previous = null;
        Link current = first;

        while (current != null && link.dData > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }

        link.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return first;
    }

    public void displayList() {
        System.out.print("list (first-->last): ");
        Link current = first;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
}
