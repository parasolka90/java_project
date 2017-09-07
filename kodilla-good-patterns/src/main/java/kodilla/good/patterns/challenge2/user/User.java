package kodilla.good.patterns.challenge2.user;

public class User {
    private String username;
    private String address;

    public User(String username, String address) {
        this.username = username;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

}
