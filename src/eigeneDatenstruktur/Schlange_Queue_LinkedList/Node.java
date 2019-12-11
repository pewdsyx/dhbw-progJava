package eigeneDatenstruktur.Schlange_Queue_LinkedList;

public class Node<T> {
    //Refs
    Node<T> mNext;
    Node<T> mPrev;

    //Content
    T mContent;
    int key;

    public Node(int aKey,T aContent){
        mContent=aContent;
        key = aKey;
        mNext=mPrev=null;
    }

}
