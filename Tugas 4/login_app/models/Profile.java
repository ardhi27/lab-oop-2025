package login_app.models;

public class Profile {
    private String name;
    private int age;
    private String hobby;
    private String fullName;


    public Profile(String name, int age, String hobby, String fullName){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.fullName = fullName;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getHobby(){
        return hobby;
    }


}




