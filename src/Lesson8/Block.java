package Lesson8;

public class Block {
    int a, b, c;
    int volume;
// опредиление обьекты одинаковые или нет
    //false or try
    public Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlok(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) return true;
        else return false;
    }



}
