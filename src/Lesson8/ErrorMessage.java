package Lesson8;

public class ErrorMessage {
    String message [] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"};
    String getErrorMessage(int i) {
        if (i >=0 & i < message.length)
            return message[i];
        else
            return "ERROR";
    }

}
