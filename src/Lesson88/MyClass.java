package Lesson88;

public class MyClass {
    public int beta;
    int gamma;
    private int alpha;

    public int getAlpha() {
        return alpha;
    }

    void setAlpha(int a) {
        alpha = a;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "alpha=" + alpha +
                ", beta=" + beta +
                ", gamma=" + gamma +
                '}';
    }
}
