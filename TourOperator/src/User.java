package mainPKG;



public class User {
    private String id;
    private String password;
    private String userType;

    // Constructor
    public User(String id, String password, String userType) {
        this.id = id;
        this.password = password;
        this.userType = userType;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

