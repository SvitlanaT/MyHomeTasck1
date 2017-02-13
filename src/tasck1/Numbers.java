package tasck1;

import java.lang.reflect.Array;

/**
 * @author Света on 13.02.2017.
 */
public class Numbers {
    private int i;
    public void print1(){
        i=1;
        while (i<=10){
            System.out.print(i);
            i++;
        }
    }
    public void print2(){
        System.out.println("\n" +" I've used do while to print this numbers");
        i=1;
        do {
            System.out.println("number is "+ i);
            i++;
        } while (i<=10);
    }

    public void factorial(){
        int n=1;
        int product =1;
        if (n==0){
            System.out.println("error");
        }else {
        do {
            n++;
        product = product*n;}
        while (n<=5);
        }
        System.out.println("factorial 5 = " + product);
    }
    public void loopTacer (){
        int tracer = 0;
        while (tracer<2){
            System.out.println("while" + tracer++);
        }

        do{
            tracer++;
            System.out.println("do while" + tracer);
    } while (tracer<6);

        for(int i = 8; i>tracer; tracer++){
            System.out.println("for" + tracer);
        }
        int[] arr = {1,2,3};
        for (int n:arr) {
            System.out.println("for each" + (n+tracer));

        }
    }
    public static void main(String[] args) {
        Numbers test = new Numbers();
        test.print1();
        test.print2();
        test.factorial();
        test.loopTacer();
    }
}
