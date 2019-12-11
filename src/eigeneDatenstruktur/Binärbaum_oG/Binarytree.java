package eigeneDatenstruktur.Binärbaum_oG;

import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {

    public  Node mRoot;

    public Binarytree(int aName){
        this.mRoot = new Node(aName);
    }

    public boolean add(Node parent, Node n, boolean left){
        boolean ret = false;

        if (left){
                parent.mLeft = n;
                ret = !ret;
            }else{
                parent.mRight = n;
                ret = !ret;
        }
        return ret;
    }


    public Node search(int i, Node node) {
        if (node != null) {
            if (node.mName == i ) {
                return node;
            } else {
                Node foundNode = search(i, node.mLeft);
                if (foundNode == null) {
                    foundNode = search(i, node.mRight);
                }
                return foundNode;
            }
        } else {
            return null;
        }
    }


    private int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.mLeft);
            int rheight = height(root.mRight);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    private void printGivenLevel (Node root ,int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.mName + " ");
        else if (level > 1)
        {
            printGivenLevel(root.mLeft, level-1);
            printGivenLevel(root.mRight, level-1);
        }
    }

    private void levelOrder(){
        int h = height(mRoot);
        for (int i=1; i<=h; i++)
            printGivenLevel(mRoot,i);
    }

    private void qLevelOrder(Node n){
        Queue<Node> order = new LinkedList<>();
        order.add(n);
        while (!order.isEmpty()){
            System.out.print(order.peek().mName + " ");
            if (order.peek().mLeft != null){
                order.add(order.peek().mLeft);
            }

            if (order.peek().mRight != null){
                order.add(order.peek().mRight);
            }
            order.remove();
        }
    }

    private void preOrder(Node node){
        /**Besuche die Wurzel
         Traversiere den linken Teilbaum
         Traversiere den rechten Teilbaum */

        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.mName + " ");

        /* then recur on left sutree */
        preOrder(node.mLeft);

        /* now recur on right subtree */
        preOrder(node.mRight);
    }

    private void inOrder(Node node){
        /**	Traversiere den linken Teilbaum
         Besuche die Wurzel
         Traversiere den rechten Teilbaum*/

        if (node == null)
            return;

        /* first recur on left child */
        inOrder(node.mLeft);

        /* then print the data of node */
        System.out.print(node.mName + " ");

        /* now recur on right child */
        inOrder(node.mRight);
    }

    private void postOrder(Node node){
        /** Traversiere den linken Teilbaum
         Traversiere den rechten Teilbaum
         Besuche die Wurzel */

        if (node == null)
            return;

        // first recur on left subtree
        postOrder(node.mLeft);

        // then recur on right subtree
        postOrder(node.mRight);

        // now deal with the node
        System.out.print(node.mName + " ");

    }
    //Wrapper Methode für den Root-Wurzel:
    public void p_inOrder(){
        inOrder(mRoot);
    }
    public void p_preOrder(){
        preOrder(mRoot);
    }

    public void p_postOrder(){
        postOrder(mRoot);
    }

    public void p_levelOrder(){
        levelOrder();
    }

    public void p_qLevelOrder(){
        qLevelOrder(this.mRoot);
    }
}
