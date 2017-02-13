package tasck3;

/**
 * @author Света on 13.02.2017.
 */
public class LoopTask {
    public void fillArr(){
    int [] arr1 = new int [10];
    for(int i =0; i<arr1.length; i++){
    arr1[i] = i+1;
        System.out.println(arr1[i]);}
    }

    public void fillWhile(){
        int n = 0;
        while (n<10){
            n++;
            System.out.println(n);
        }
        int [] arr2 = new int [10];

        int i=0;
        while (i<=arr2.length-1){
            arr2[i] = i+1;
            System.out.println(arr2[i]);
            i++;
        }
    }
    public void backArr(){
        int[] arr3 = {1,2,3};
        int i = arr3.length-1;
        while (i>=0) {
            System.out.println(arr3[i]);
            i--;
        }
        for (int e:arr3) {
            System.out.println( e );
        }
        System.out.println(" array length = " + arr3.length);
    }

    public static void main(String[] args) {
        LoopTask t = new LoopTask();
        t.fillArr();
        t.fillWhile();
        t.backArr();
        System.out.println();
    }

}
