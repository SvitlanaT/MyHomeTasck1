package tasck3;

/**
 * @author Света on 13.02.2017.
 */
public class MethodsTask {
    public void noInNoOut(){
        System.out.println("No in no out");
    }
    public void intInNoOut(int in){
        System.out.println("No out, int in = " + in);
    }
    public int NoInIntOut (){
        return 7;
    }
    public int twoIntInOneIntOut(int x, int y){
        int sum = x + y;
        return sum;
    }
    public boolean boInBoOut (boolean t){
        return true;
    }
    public void twoInNoOut(int x, boolean f){
        System.out.println("In = "+ x + " "+ f + " no out");
    }
    public boolean twoInBoOut (int a, int b){
        if (a==b){
            return true;} else {
            return false;
        }
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
