package eigeneDatenstruktur.Binärbaum_oG;

public class Baum1_Test {
    public static void main(String[] args) {
        //System.out.println("Binärbaum_oG-Test");
        Node b1 = new Node(3);
        Node b2 = new Node(2);
        Node b3 = new Node(4);

        Node b4 = new Node(10);
        Node b5 = new Node(8);
        Node b6 = new Node(9);
        Node b7 = new Node(12);
        Node b8 = new Node(15);


        Binarytree binarytree = new Binarytree(7);
        binarytree.add(binarytree.mRoot,b1,true);
        binarytree.add(binarytree.mRoot.mLeft,b2,true);
        binarytree.add(binarytree.mRoot.mLeft,b3,false);

        binarytree.add(binarytree.mRoot,b4,false);
        binarytree.add(binarytree.mRoot.mRight,b5,true);

        binarytree.add(binarytree.mRoot.mRight.mLeft,b6,false);

        binarytree.add(binarytree.mRoot.mRight,b7,false);
        binarytree.add(binarytree.mRoot.mRight.mRight,b8,false);

        System.out.println("Der Knoten ganz rechts unten per Direktanwahl: " + binarytree.mRoot.mRight.mRight.mRight.mName);

        //get Methode ist die search; gibt ein Node Obj zurück
        int y = 90;
        System.out.println("Suche nach Node " + y);
        Node searched = binarytree.search(y,binarytree.mRoot);
        if (searched!=null){
            System.out.println(searched.mName);
        }else{
            System.out.println("Knoten nicht gefunden!");
        }

        //Traversiern:
        System.out.println("Binärbaum in preOrder / Hauptreihenfolge: " );
        binarytree.p_preOrder();
        System.out.println("------------------------------------");

        System.out.println("Binärbaum in inOrder / Symmetrische Reihenfolge: ");
        binarytree.p_inOrder();
        System.out.println("------------------------------------");

        System.out.println("Binärbaum in postOrder / Nebenreihenfolge: ");
        binarytree.p_postOrder();
        System.out.println("------------------------------------");

        System.out.println("Binärbaum in levelOrder: ");
        binarytree.p_levelOrder();
        System.out.println();
        binarytree.p_qLevelOrder();
        System.out.println("------------------------------------");

    }
}


