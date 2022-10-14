package part_15;

public class Ex15_19_UserInfo implements java.io.Serializable{

    private String name;
    private String password;
    private int age;

    public Ex15_19_UserInfo(){
        this("Unknown", "1111", 0);
    }

    public Ex15_19_UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString(){
        return "(" + name + ", " + password + ", " + age + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
