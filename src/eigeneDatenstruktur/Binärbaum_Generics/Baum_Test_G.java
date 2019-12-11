package eigeneDatenstruktur.Binärbaum_Generics;

public class Baum_Test_G {
    public static void main(String[] args) {
        System.out.println("Binärbaum_oG-Test");
        NodeT<Integer> b1 = new NodeT<>(3);
        NodeT<Integer> b2 = new NodeT<>(2);
        NodeT<Integer> b3 = new NodeT<>(4);

        NodeT<Integer> b4 = new NodeT<>(10);
        NodeT<Integer> b5 = new NodeT<>(8);
        NodeT<Integer> b6 = new NodeT<>(9);
        NodeT<Integer> b7 = new NodeT<>(12);
        NodeT<Integer> b8 = new NodeT<>(15);


        BinarytreeT<Integer> binarytreeT = new BinarytreeT<>(7);
        binarytreeT.add(binarytreeT.mRoot,b1,true);
        binarytreeT.add(binarytreeT.mRoot.mLeft,b2,true);
        binarytreeT.add(binarytreeT.mRoot.mLeft,b3,false);

        binarytreeT.add(binarytreeT.mRoot,b4,false);
        binarytreeT.add(binarytreeT.mRoot.mRight,b5,true);

        binarytreeT.add(binarytreeT.mRoot.mRight.mLeft,b6,false);

        binarytreeT.add(binarytreeT.mRoot.mRight,b7,false);
        binarytreeT.add(binarytreeT.mRoot.mRight.mRight,b8,false);

        System.out.println(binarytreeT.mRoot.mRight.mRight.mRight.mName);

        NodeT searched = binarytreeT.search(15, binarytreeT.mRoot);
        System.out.println(searched.mName);

        //Traversiern:
        System.out.println("Binörbaum in preOrder / Hauptreihenfolge: " );
        binarytreeT.p_preOrder();
        System.out.println("------------------------------------");

        System.out.println("Binörbaum in inOrder / Symmetrische Reihenfolge: ");
        binarytreeT.p_inOrder();
        System.out.println("------------------------------------");

        System.out.println("Binörbaum in postOrder / Nebenreihenfolge: ");
        binarytreeT.p_postOrder();
        System.out.println("------------------------------------");

        System.out.println("Binörbaum in levelOrder: ");
        binarytreeT.p_levelOrder();
        System.out.println("------------------------------------");

    }
}


