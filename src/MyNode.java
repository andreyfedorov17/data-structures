public class MyNode {
    public int iData;
    public double dData;
    public MyNode leftChild;
    public MyNode rightChild;

    public void displayNode() {
        System.out.print("{" + iData + ". " + dData + "}");
    }
}