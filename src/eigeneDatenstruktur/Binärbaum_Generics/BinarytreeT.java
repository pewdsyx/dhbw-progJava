package eigeneDatenstruktur.Binärbaum_Generics;

public class BinarytreeT<T> {

    NodeT<T> mRoot;

    public BinarytreeT(T aName){
        this.mRoot = new NodeT<>(aName);
    }

    public boolean add(NodeT<T> parent, NodeT<T> n, boolean left){
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

    public NodeT<T> get(T i){

        return new NodeT<>(i);
    }

    public NodeT<T> search(T i, NodeT<T> nodeT) {
        if (nodeT != null) {
            if (nodeT.mName == i ) {
                return nodeT;
            } else {
                NodeT<T> foundNodeT = search(i, nodeT.mLeft);
                if (foundNodeT == null) {
                    foundNodeT = search(i, nodeT.mRight);
                }
                return foundNodeT;
            }
        } else {
            return null;
        }
    }


    private int height(NodeT<T> root)
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

    private void printGivenLevel (NodeT<T> root , int level) {
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

    private void preOrder(NodeT<T> nodeT){
        /**Besuche die Wurzel
         Traversiere den linken Teilbaum
         Traversiere den rechten Teilbaum */

        if (nodeT == null)
            return;

        /* first print data of nodeT */
        System.out.print(nodeT.mName + " ");

        /* then recur on left sutree */
        preOrder(nodeT.mLeft);

        /* now recur on right subtree */
        preOrder(nodeT.mRight);
    }

    private void inOrder(NodeT<T> nodeT){
        /**	Traversiere den linken Teilbaum
         Besuche die Wurzel
         Traversiere den rechten Teilbaum*/

        if (nodeT == null)
            return;

        /* first recur on left child */
        inOrder(nodeT.mLeft);

        /* then print the data of nodeT */
        System.out.print(nodeT.mName + " ");

        /* now recur on right child */
        inOrder(nodeT.mRight);
    }

    private void postOrder(NodeT<T> nodeT){
        /** Traversiere den linken Teilbaum
         Traversiere den rechten Teilbaum
         Besuche die Wurzel */

        if (nodeT == null)
            return;

        // first recur on left subtree
        postOrder(nodeT.mLeft);

        // then recur on right subtree
        postOrder(nodeT.mRight);

        // now deal with the nodeT
        System.out.print(nodeT.mName + " ");

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
}
