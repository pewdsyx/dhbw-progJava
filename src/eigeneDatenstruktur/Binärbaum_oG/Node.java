package eigeneDatenstruktur.Binärbaum_oG;

public class Node {
    //Sohn-Vater-Beziehung
    Node mLeft, mRight;
    int mName;

    public Node(int aName){
        this.mName = aName;
        this.mLeft = this.mRight = null;
    }

}
