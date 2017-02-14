package tasck3;

/**
 * @author Света on 13.02.2017.
 */
public class MethodsTask {
    private void noInNoOut(){
        System.out.println("No in no out");
    }

    private void intInNoOut(int in){
        System.out.println("No out, int in = " + in);
    }

    private int NoInIntOut(){
        return 7;
    }

    private int twoIntInOneIntOut(int x, int y){
        return x + y;
    }

    private boolean boInBoOut(boolean t){
        return true;
    }

    private void twoInNoOut(int x, boolean f){
        System.out.println("In = "+ x + " "+ f + " no out");
    }

    private boolean twoInBoOut(int a, int b){
        return a == b;
    }

    public static void main(String[] args) {
        MethodsTask s = new MethodsTask();
        s.noInNoOut();
        s.intInNoOut(5);
        System.out.println(s.NoInIntOut());
        System.out.println(s.twoIntInOneIntOut(1,2));
        System.out.println(s.boInBoOut(true));
        s.twoInNoOut(2,true);
        System.out.println(s.twoInBoOut(2,2));
    }
}
