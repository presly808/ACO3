package ua.artcode.data_structures.java.tree_st;

import ua.artcode.algo.BinarySearch;

/**
 *
 */
public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {

    private TreeNode<T> root;

    public BinarySearchTree(){

    }

    public BinarySearchTree(T...arr){
        for(T el : arr){
            add(el);
        }
    }

    @Override
    public void add(T el) {
        if (root == null) {
            root = new TreeNode<>(el, null, null, null);
        } else {
            add(el, root);
        }
    }

    @Override
    public T min() {
        TreeNode<T> iter = root;
        while (iter.getlChild() != null){
            iter = iter.getlChild();
        }
        return iter.getValue();
    }

    @Override
    public T max() {
        TreeNode<T> iter = root;
        while (iter.getrChild() != null){
            iter = iter.getrChild();
        }
        return iter.getValue();
    }

    public void add(T el, TreeNode<T> curr){

        if(el.compareTo(curr.getValue()) < 0){
            if(curr.getlChild() == null){
                curr.setlChild(new TreeNode<T>(el, curr, null, null));
            } else {
                add(el, curr.getlChild()); // recursion next step go left
            }
        } else if(el.compareTo(curr.getValue()) > 0){
            if(curr.getrChild() == null){
                curr.setrChild(new TreeNode<T>(el, curr, null, null));
            } else {
                add(el, curr.getrChild()); // recursion next step go right
            }
        }


    }



    @Override
    public boolean contains(T el) {
        return false;
    }

    @Override
    public void traversePrint() {
        print(root);
    }

    private void print(TreeNode node){
        if(node == null){
            return;
        }

        print(node.getlChild());
        System.out.print(node.getValue() + "|");
        print(node.getrChild());

    }
}
