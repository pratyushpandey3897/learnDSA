package Tree;

import com.sun.source.tree.Tree;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int data){
        if (root != null){
            root.insert(data);
        } else
            this.root = new TreeNode(data);
    }

    public TreeNode find(int data){
        if (root != null){
            return root.find(data);
        }
        return null;
    }
    public void delete(int data){
        TreeNode currentNode = this.root;
        TreeNode parentNode = this.root;
        boolean isLeftChild = false;

        if (currentNode == null)
            return;

        while(currentNode != null && currentNode.getData() != data){
            parentNode = currentNode;
            if (data < currentNode.getData()){
                currentNode = currentNode.getLeftChild();
                isLeftChild = true;
            } else {
                currentNode = currentNode.getRightChild();
                isLeftChild = false;
            }
        }
        if (currentNode == null)
            return;
        if (currentNode.getLeftChild() == null && currentNode.getRightChild()==null){
            if (currentNode == root)
                root = null;
            else{
                if (isLeftChild){
                    currentNode.setLeftChild(null);
                } else
                    currentNode.setRightChild(null);
            }

        } else if (currentNode.getRightChild() == null){
            if (currentNode == root)
                root = currentNode.getLeftChild();
            else if (isLeftChild){
                parentNode.setLeftChild(currentNode.getLeftChild());
            } else
                parentNode.setRightChild(currentNode.getLeftChild());
        } else if (currentNode.getLeftChild() == null){
            if (currentNode == root)
                root = currentNode.getRightChild();
            else if (isLeftChild){
                parentNode.setLeftChild(currentNode.getRightChild());
            } else
                parentNode.setRightChild(currentNode.getRightChild());
        }

        }
    }

}