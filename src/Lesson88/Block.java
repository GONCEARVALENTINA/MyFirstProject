package Lesson88;

public class Block {
    int a, b, c;
    int volume;

    public Block(int i, int j, int k) {
        this.a = i;
        this.b = j;
        this.c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }

    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}
