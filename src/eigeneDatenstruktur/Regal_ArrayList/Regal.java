package eigeneDatenstruktur.Regal_ArrayList;

/**
 * Eigene ArrayList mit Einschränkungen der Funktion
 */

public class Regal<T> {
    T[] mRegalArray;
    int mNextFreeIndex;

    public Regal(){
        //Standard Konstruktur mRegalArray mit Größe 5
        this(5);
    }

    public Regal(int i){
        mRegalArray = (T[])new Object[i];
        mNextFreeIndex = 0;
    }

    /**
     *
     * @param s entspricht dem String der hinzugefügt werden soll
     */
    public void add(T s){
        if (mNextFreeIndex < mRegalArray.length){
            mRegalArray[mNextFreeIndex] = s;
            mNextFreeIndex++;
        }else{
            T[] big = (T[])new Object[mRegalArray.length*2];
            for (int i = 0; i < mRegalArray.length-1; i++){
                big[i] = mRegalArray[i];
            }
            big[mRegalArray.length] = s;
            mNextFreeIndex = mRegalArray.length +1;
            mRegalArray = big;
            mNextFreeIndex++;
        }
    }

    public T get(int i){
        if (i < mRegalArray.length){
            return mRegalArray[i];
        }else {
            return null;
        }
    }

    public boolean delete(T s){
        boolean ret = false;

        for (int i = 0; i < mRegalArray.length; i++){
            if (mRegalArray[i]!=null && mRegalArray[i].equals(s)){
                mRegalArray[i] = null;
                ret = !ret; //ret = true;
            }
        }
        return ret;
    }

    public int contains(T s){
        int ret = -1;
        for (int i = 0; i < mRegalArray.length;i++){
            if (mRegalArray[i]!=null && mRegalArray[i].equals(s)){
                ret = i;
                break;
            }
        }
        return ret;
    }

    public Regal join(Regal r){
        Regal t;
        int n = r.mRegalArray.length;
        int m = this.mRegalArray.length;
        t = new Regal(n+m);
        for (int i = 0; i < m; i++){
            t.add(this.mRegalArray[i]);
        }

        for (int x = t.mRegalArray.length; x < ((t.mRegalArray.length+n)-1); x++){
            t.add(r.mRegalArray[x-t.mRegalArray.length]);
        }
        return t;
    }
}
