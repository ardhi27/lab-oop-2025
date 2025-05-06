package login_app.models;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName;

    public Profile(String fullName, int age, String hobby, String nickName) {
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (!fullName.isEmpty()) {
            this.fullName = fullName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        if (!hobby.isEmpty()) {
            this.hobby = hobby;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (!nickName.isEmpty()) {
            this.nickName = nickName;
        }
    }
}
