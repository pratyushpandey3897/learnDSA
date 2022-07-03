package Tree;

import com.sun.source.tree.Tree;

public class TreeNode {
    private final int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
    public TreeNode find(int data){
        if (data == this.data)
            return this;

        if (data < this.data && this.leftChild!= null)
            return this.leftChild.find(data);

        if (data > this.data && this.rightChild!= null)
            return this.rightChild.find(data);
        return null;
    }

    public void insert(int data){
        if (data >= this.data){
            if (this.rightChild == null)
                this.rightChild = new TreeNode(data);
            else
                this. rightChild.insert(data);
        } else {
            if (this.leftChild == null)
                this.leftChild = new TreeNode(data);
            else
                this.leftChild.insert(data);
        }
    }
    public int getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
