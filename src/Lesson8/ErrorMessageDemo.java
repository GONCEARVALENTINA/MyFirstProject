package Lesson8;

public class ErrorMessageDemo {
    public static void main(String[] args) {
        ErrorMessage err = new ErrorMessage();
        System.out.println(err.getErrorMessage(0));
        System.out.println(err.getErrorMessage(19));
    }
}
