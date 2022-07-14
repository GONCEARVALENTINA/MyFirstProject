package L12JAVA;

public class User {

    public static User user = new User();
    private String userName;
    private String password;

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        password = pass;
    }

}






