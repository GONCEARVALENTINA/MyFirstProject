package L7JAVA;

public class Min {
    public static void main(String[] args) {
        int[] arrValues = {23,56,12,85,68};
        int small = arrValues[0];

        for(int i=0;i<arrValues.length;i++) {
            for(int j=i+1;j<arrValues.length;j++) {
                if(arrValues[i] > arrValues[j]) {
                    small = arrValues[i];
                    arrValues[i] = arrValues[j];
                    arrValues[j] = small;
                }
            }
        }
        System.out.println("The smallest element is: " + arrValues[0]);
    }
}