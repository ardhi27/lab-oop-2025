package login_app.models;

public class User {
    private String username;
    private String password;
    private Profile profile;

    public User(String username, String password, Profile profile) {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String usermame) {
        if (!username.isEmpty()) {
            this.username = usermame;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!password.isEmpty()) {
            this.password = password;
        }
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
