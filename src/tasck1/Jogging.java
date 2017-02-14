package tasck1;

import java.util.Scanner;

/**
 * @author Света on 13.02.2017.
 */
public class Jogging {

    private void chooseDistance(int myDistance){

        switch (myDistance){
            case 2: System.out.println("Your distance is 2 km");
                break;
            case 5: System.out.println("Your distance is 5 km");
                break;
            case 10: System.out.println("Your distance is 10 km");
                break;
            case 21: System.out.println("Your distance is 21 km");
                break;
            case 42: System.out.println("Your distance is 42 km");
        }
    }

    public static void main(String[] args) {
        System.out.println("The options are 2, 5, 10, 21, 42 km (just type the number)");
        Scanner dist = new Scanner(System.in);
        int myDistance = dist.nextInt();
        Jogging test = new Jogging();
        test.chooseDistance(myDistance);

    }
}
