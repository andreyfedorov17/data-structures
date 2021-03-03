public class Link {
    //public int iData;
    public long dData;
    public Link next;

    public Link(long dData) {
        //this.iData = iData;
        this.dData = dData;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
