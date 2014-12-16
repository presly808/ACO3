package ua.artcode.data_structures.java.tree_st;

/**
 *
 */
public class TestTree {

    public static void main(String[] args) {
        ITree<Integer> tree = new BinarySearchTree<>(50,25,10,20,35,40,75,60,80,90);
        tree.traversePrint();
        System.out.println("end");


    }

}
