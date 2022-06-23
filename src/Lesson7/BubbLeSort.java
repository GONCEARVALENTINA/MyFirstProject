package Lesson7;

public class BubbLeSort {
    public static void main(String[] args) {
        int needsToBeSorted[] = {268, 67, 5, 34, -7, -9, -356, -66, 71, 98};
        int a, b, tmp;
        int size = 10;

        System.out.println("Initial array: ");
        for (int i= 0; i < 10; i++)
            System.out.print(needsToBeSorted[i] + " ");

        for (a=1; a < size; a++)
            for (b=size-1; b >= a; b--){
                if (needsToBeSorted[b-1] > needsToBeSorted[b]){
                    tmp = needsToBeSorted[b-1];
                    needsToBeSorted[b-1] = needsToBeSorted[b];
                    needsToBeSorted[b] = tmp;
                }
            }

        System.out.println("\nSorted array: ");
        for (int i = 0; i < 10; i++){
            System.out.print(needsToBeSorted[i] + " ");
        }
    }
}