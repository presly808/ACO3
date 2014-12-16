package ua.artcode.data_structures.java.tree_st;

/**
 *
 */
public class TreeNode <T> {

    private T value;
    private TreeNode<T> parent;
    private TreeNode<T> lChild;
    private TreeNode<T> rChild;

    public TreeNode() {

    }

    public TreeNode(T value, TreeNode<T> parent, TreeNode<T> lChild, TreeNode<T> rChild) {
        this.value = value;
        this.parent = parent;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public TreeNode<T> getlChild() {
        return lChild;
    }

    public void setlChild(TreeNode<T> lChild) {
        this.lChild = lChild;
    }

    public TreeNode<T> getrChild() {
        return rChild;
    }

    public void setrChild(TreeNode<T> rChild) {
        this.rChild = rChild;
    }
}
