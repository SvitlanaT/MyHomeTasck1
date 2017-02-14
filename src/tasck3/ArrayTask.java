package tasck3;

import java.util.Arrays;

/**
 * @author Света on 14.02.2017.
 */
public class ArrayTask {
    public void twoArrays(){
        int[]arr1 = {2,3,4};
        int []arr2 = {2,3,4};
        System.out.println(Arrays.equals(arr1,arr2));
    }

    public void changeArray(){
        int [] arr3 = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<5; i++){
            arr3[i]=12;
        }
        for (int e:arr3) {
            System.out.println(e);

        }
        for (int i:arr3){
            if (i%2==0){
                System.out.println("even element " + i);
            }
        }
    }

    public void copyArray(){
        int [] arr4 = {2,2,2};
        int [] arr5 = {1, 1, 1};
        System.arraycopy(arr4,0,arr5,0,3);
        for (int c:arr5){
            System.out.println("It's a copy of arr4 now" + c);
        }
    }

    private void recursArray(int c){


        int[] arr6 = {8,7,6,5,4,3,2,1};
        System.out.print(arr6[c]);

        if(c!=0){

            c--;
        recursArray(c);}else{
            for(int i:arr6){
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayTask test = new ArrayTask();
        test.twoArrays();
        test.changeArray();
        test.copyArray();
        test.recursArray(7);

    }
}
