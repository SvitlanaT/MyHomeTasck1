package tasck2;

/**
 * @author Света on 13.02.2017.
 */
public class NameTasck {
    private String name;
    private int age;
    private String hobby;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public NameTasck(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public NameTasck(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        NameTasck test = new NameTasck();
        test.setName("James Bond");
        System.out.println(test.getName());
    }
}
