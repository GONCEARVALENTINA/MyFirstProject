package Lesson88;

public class FailSoftArray {
    private final int[] a;
    private final int errVal;
    public int length;

    public FailSoftArray(int size, int errV) {
        a = new int[size];
        errVal = errV;
        length = size;

    }

    public int get(int index) {
        if (indexOk(index)) return a[index];
        return errVal;
    }

    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    public boolean indexOk(int index) {
        return index >= 0 & index < length;
    }


}