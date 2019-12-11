package eigeneDatenstruktur.Schlange_Queue_LinkedList;


public class Schlange<T> {
    Node<T> mHead, mTail;
    int mSize;

    public Schlange(){
        mSize=0;
        mHead=mTail=null;
    }


    /**
     *
     * @param s Paket das in die Schlange gehängt werden soll; wird an den Anfang angehängt.
     */
    public void add(T s){
        mSize++;
        Node<T> k = new Node<>(0, s);

        if (mSize > 1 ){
            k.mNext = mHead;
            mHead.mPrev = k;
        }else{
            mTail = k;
        }
        mHead = k;
    }

    public boolean contains(T s){
        Node<T> n  = mHead;
        while (n != null){

            if (n.mContent.equals(s)){
                return true;
            }

            n = n.mNext;
        }
        return false;
    }

    public void addHead(T s) {

        mSize++;
        Node<T> k = new Node<>(mSize,s);
        if(mSize>1)
        {
            k.mNext=mHead;
            mHead.mPrev=k;
        }
        else
        {
            mTail=k;
        }
        mHead=k;
    }

    /**
     *
     * @param key: anhand diesem wird die Position in der Schlange festgelegt, sie müssen geordnet sein
     *           -> darüber wird es Sortiert!
     * @param value: der Inhalt des Nodes; hat nichts mit der Sortierung zu tun
     */
    public void addSorted(int key, T value){
        int pos;
        //Erzeuge neue Schlange; füge ihr ein Node hinzu, und setze den key manuell:
        Schlange<T> stemp = new Schlange<>();
        stemp.add(value);
        //ist immer mHead, da die Schlange nur ein Node hat
        stemp.mHead.key = key;

        //Ist das Element schon in der Schlange vorhanden?
        if (contains(value) != true){
            //Suche den key an dem der value gleich value -1 ist
            for (int i = 0; i <= this.mSize; i++){
                //Betrache den mKey des aktuellen Nodes muss geschaut ob er kleiner, größer, oder
                //gleich des parameter keys ist ob dann entsprechend die Position merken um sie dann
                // in pos zu speichern um dann den join richtig anzurufen.
                //Achtung join füngt genau nach dem key ein!!
            }
            //vkey := ist die postion des keys-1
            int pos1 = 0; //macht kein Sinn aber damit ist der Fehler nicht mehr da!
            int vkey = pos1 - 1;
            this.join(stemp,vkey);
        }else{
            //Value ist schon in der Schlange drin
            System.out.println("Value ist schon in der Schlange vorhanden!");
        }
    }

    public void returnAll() {
        Node<T> temp= mHead;
        while(temp!=null)
        {
            //System.out.println(temp.mContent);
            temp=temp.mNext;
        }
    }

    public boolean contains1(T s) {
        Node<T> temp= mHead;
        while(temp!=null)
        {
            if(temp.mContent.equals(s))
            {
                return true;
            }
            temp=temp.mNext;

        }
        return false;
    }

    public void addLast(T s) {
        mSize++;
        Node<T> k= new Node<>(mSize,s);
        if(mSize>1)
        {
            k.mPrev=mTail;
            mTail.mNext=k;
            mTail=k;
        }
        else
        {
            mHead=k;
            mTail=k;
        }
    }

    /*public String removeFirst() {
        String out;
        Node temp;
        if(mSize>1)
        {
            temp=(Node)mHead.mContent;
            mHead=mHead.mNext;
            mHead.mPrev=null;
        }
        else
        {
            temp=(Node) mHead.mContent;
            mHead=null;
        }
        mSize--;
        out = temp.toString();
        return out;
    }*/

    public T removeFirstT() {
        T out;
        Node temp;
        if(mSize>1)
        {
            temp=(Node)mHead.mContent;
            mHead=mHead.mNext;
            mHead.mPrev=null;
        }
        else
        {
            temp=(Node) mHead.mContent;
            mHead=null;
        }
        mSize--;
        out = (T)temp;
        return out;
    }

    public String removeLast() {
        String out;
        Node temp;
        if(mSize>1)
        {
            temp=(Node) mTail.mContent;
            mTail=mTail.mPrev;
            mTail.mNext=null;
        }
        else
        {
            temp =mHead;
            mHead=null;
        }
        out = temp.toString();
        return out;
    }

    public Node<T> containsGiveElement(T s) {
        Node<T> temp= mHead;
        while(temp!=null)
        {
            if(temp.mContent.equals(s))
            {
                return temp;
            }
            temp=temp.mNext;

        }
        return null;
    }



    public T containsGiveElementRek(T s,Node x) {
        if(x==null)
        {
            return null;
        }
        else
        {
            if(x.mContent==s)
            {
                return (T)x.mContent;
            }
            else
            {
                return containsGiveElementRek(s,x.mNext);
            }
        }
    }



    public void join(Schlange q, int i) {
        Node<T> tempStart=mHead;
        Node<T> tempEnd;
        if(mSize>1)
        {
            mSize+=q.mSize;
            for(int x=1;x<i;x++)
            {
                tempStart=tempStart.mNext;
            }
            tempEnd=tempStart.mNext;
            tempStart.mNext=q.mHead;
            q.mTail.mNext=tempEnd;
        }
    }


    public void joinCloneQ2(Schlange q, int i)
    {
        Node<T> tempStart=mHead;
        Node<T> tempEnd;
        if(mSize>1)
        {
            mSize+=q.mSize;
            for(int x=1;x<i;x++)
            {
                tempStart=tempStart.mNext;
            }
            tempEnd=tempStart.mNext;
            Node counter=q.mHead;
            while(counter!=null) //Neue Objekte mit dem selben Content erstellen
            {
                tempStart.mNext=new Node<>(mSize,(T) counter.mContent);
                tempStart=tempStart.mNext;
                counter=counter.mNext;
            }
            tempStart.mNext=tempEnd;
        }
    }
}
