package ua.artcode.dynamic_ds;

public class NodeTest {


    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5};

        Node chain = NodeUtils.genChain(mas);
        System.out.println(NodeUtils.toString(chain));

        /*Node first = new Node(1, null);
        Node second = new Node(2, first);
        Node third = new Node(3, second);
        Node fourth = new Node(4, third);
        Node five = new Node(5, fourth);


        Node top = new Node(0, null);
        for(int i = 1; i < 6; i++){
            top = new Node(i,top);
        }*/


    }
}
