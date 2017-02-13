package tasck2;

/**
 * @author Света on 13.02.2017.
 */
public class OtherClass {
    public static void main(String[] args) {
        NameTasck test2 = new NameTasck("Donald Tramp ", 64, " making money");
        System.out.println(test2.getName() + test2.getAge() + test2.getHobby());
        NameTasck test3 = new NameTasck();
        test3.setName("Hilary Clinton ");
        test3.setAge(55);
        test3.setHobby(" speaking");
        System.out.println(test3.getName() + test3.getAge() + test3.getHobby());
    }

}
