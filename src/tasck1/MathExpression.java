package tasck1;

/**
 * @author Света on 13.02.2017.
 */
public class MathExpression {
    private int x;
    private int y;
    private int sum;
   private void check(int x, int y){
       sum = x+y;
       if (sum%2==0){
           System.out.println("This number is even");
       }
       if (sum>=10){
           System.out.println("10 or more");
       }
       if (sum!=1000){
           System.out.println("not a 1000");
       }
       if (sum>100 & sum<200){
           System.out.println("between 100 and 200");
       }
       if(sum!=50 & sum%2!=0) {
//           Безглузда умова так як 50 теж не парне
           System.out.println("Not 50 & not even");
       }
       if(sum%2==0 || sum%2!=0 || sum>300 ||sum<1000 ){
//           теж безглузда умова
           System.out.println("this will work anyway");
       }
   }

   private void print(){
       for (int i = 0; i <10 ; i++) {
           System.out.println("I love java");
       }
       for (int i = 0; i <25 ; i++) {
           System.out.println("Java rules " + (1+i));

       }
   }

    public static void main(String[] args) {
        MathExpression test = new MathExpression();
        test.check(3,100);
        test.print();
    }

}
