package Jawad.Tourist;

public class Tourist {
    // Properties
    private String username;
    private String id;
    private String phoneNumber;
    private String gender;
    private String country;
    private String email;

    // Constructor
    public Tourist(String username, String id, String phoneNumber, String gender, String country, String email) {
        this.username = username;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.country = country;
        this.email = email;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

