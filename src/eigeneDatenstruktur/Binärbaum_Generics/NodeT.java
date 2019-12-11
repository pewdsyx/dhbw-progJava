package eigeneDatenstruktur.Binärbaum_Generics;

public class NodeT<T> {
    //Sohn-Vater-Beziehung
    NodeT<T> mLeft, mRight;
    T mName;

    public NodeT(T aName){
        this.mName = aName;
        this.mLeft = this.mRight = null;
    }

}
