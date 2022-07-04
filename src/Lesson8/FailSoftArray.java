package Lesson8;

public class FailSoftArray {
    private  int a[];
    private int errVal;
    public  int length;
    public FailSoftArray(int size, int errV) {
        a = new int[size];
        errVal = errV;
        length = size;
    }
    public int get(int index){
        if (indexDK(index))return a[index];
        return errVal;
    }
    public  boolean put(int index, int val){
        if (indexDK(index)){
            a[index] = val;
            return  true;
        }
        return false;
    }
    public boolean indexDK(int index) {
        if(index >=0 & index < length) return true;
        return false;
    }


        }






