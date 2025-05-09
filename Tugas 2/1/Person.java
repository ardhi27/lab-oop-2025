public class Person{
    String name;
    int age;
    boolean isMale;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Integer getAge(){
        return age;
    }

    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    public Boolean getGender(){
        return isMale;
    }

    public static void main(String [] args){
        Person person = new Person();
        person.setName("Agus");
        person.setAge(18);
        person.setGender(true);
    
        String gender;
        if(person.getGender()){
            gender = "laki laki";
        }else{
            gender = "Perempuan";
        }
    
        System.out.printf(String.format("Nama dia adalah %s, umur %d adalah dan beliau berkelamin %s", person.getName(),person.getAge(), gender ));
    }
}


