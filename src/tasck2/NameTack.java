package tasck2;

/**
 * @author Света on 13.02.2017.
 */
public class NameTack {
    private int o;
    private String nameR;
    private int age;
    private String hobby;

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getHobby() {
        return hobby;
    }

    void setHobby(String hobby) {
        this.hobby = hobby;
    }

    NameTack(String nameR, int age, String hobby) {
        this.nameR = nameR;
        this.age = age;
        this.hobby = hobby;
    }

    NameTack(){

    }

    String getNameR() {
        return nameR;
    }


    void setNameR(String nameR) {
        this.nameR = nameR;
    }

    public static void main(String[] args) {
        NameTack test = new NameTack();
        test.setNameR("James Bond");
        System.out.println(test.getNameR());
        System.out.println(test.getNameR());

    }
}
