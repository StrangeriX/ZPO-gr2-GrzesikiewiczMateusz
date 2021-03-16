package zad1;
import java.util.ArrayList;

public class BubbleSort implements SortStrategy{
    public ArrayList<Kaczka> Sort (ArrayList<Kaczka> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i; j < arrayList.size() - 1; j++) {
                if (arrayList.get(i).name.compareTo(arrayList.get(j + 1).name) > 0) {
                    Kaczka temp = arrayList.get(j + 1);
                    arrayList.set(j + 1, arrayList.get(i));
                    arrayList.set(i, temp);
                }
            }
        }
        return arrayList;
    }

    public Kaczka[] Sort (Kaczka[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i].name.compareTo(array[j + 1].name) > 0) {
                    Kaczka temp = array[j + 1];
                    array[j+1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
