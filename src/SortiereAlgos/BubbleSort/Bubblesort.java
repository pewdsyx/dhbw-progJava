package SortiereAlgos.BubbleSort;

public class Bubblesort {

    public static void main(String[] args) {

        int[] a= createArray(10);


//        int[] a = new int[] {1,2,3,4,1,4,12,13,2,312,3};

        getAll(a);

        BubbleSort(a);

        getAll(a);

    }


    public static int[] createArray(int aL) {
        int[] x= new int[aL];

        for (int k=0; k<x.length;k++)
        {
            x[k]=(int) Math.round((Math.random()*100));
        }

        return x;
    }


    public static void BubbleSort(int[] a) {

        int temp=0;

        for(int x=a.length; x>0; x--)
        {
            for(int k=0;k<x-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
    }

    public static void getAll(int[] a) {

        for( int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }

}
