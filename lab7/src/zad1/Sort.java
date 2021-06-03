package zad1;

import java.util.Arrays;

public class Sort implements IFile{
    @Override
    public int[] executeOperation(int[] ints) {
        Arrays.sort(ints);
        return ints;
    }
}
