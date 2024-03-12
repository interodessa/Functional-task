package app;

public class User {
    private final String name;
    private final String phone;

    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String toString(){
        return "Name:" + name +", phone:" + phone;
    }
}
