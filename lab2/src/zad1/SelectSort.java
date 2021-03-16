package zad1;

import java.util.ArrayList;

public class SelectSort implements SortStrategy{
    public ArrayList<Kaczka> Sort (ArrayList<Kaczka> arrayList) {
        for ( int j=0; j < arrayList.size()-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < arrayList.size(); k++ )
                if ( arrayList.get(k).name.compareTo( arrayList.get(min).name ) < 0 ) min = k;

            Kaczka temp = arrayList.get(j);
            arrayList.set(j, arrayList.get(min));
            arrayList.set(min, temp);
        }
        return arrayList;
    }

    public Kaczka[] Sort (Kaczka[] array) {
        for ( int j=0; j < array.length-1; j++ )
        {
            int min = j;
            for ( int k=j+1; k < array.length; k++ )
                if ( array[k].name.compareTo( array[min].name ) < 0 ) min = k;

            Kaczka temp = array[j];
            array[j] = array[min];
            array[min] = temp;
        }
        return array;
    }
}
