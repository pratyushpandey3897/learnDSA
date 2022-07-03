package DSAList;

public class Node {

    private int data; // data will be int type
    private Node nextNode;

    //Constructor to create a new node
    Node (int d) {
        data = d;
        nextNode = null;
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){

        return "Data:" + this.data;
    }
}
