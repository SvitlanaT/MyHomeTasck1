package tasck2;

/**
 * @author Света on 13.02.2017.
 */
public class OtherClass {
    public static void main(String[] args) {
        NameTack test2 = new NameTack("Donald Tramp ", 64, " making money");
        System.out.println(test2.getNameR() + test2.getAge() + test2.getHobby());
        NameTack test3 = new NameTack();
        test3.setNameR("Hilary Clinton ");
        test3.setAge(55);
        test3.setHobby(" speaking");
        System.out.println(test3.getNameR() + test3.getAge() + test3.getHobby());
    }

}
