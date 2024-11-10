package edu.citytech.javareview.datastructure.sort;

public class SortLogic {

    /*
     * .toString: size=4 [4, 1, 3, 5] with 4 iterations 
     * 
     */

    static int sort(Integer[] data) {
        int operationCount = 0;
        int loop = (int)Math.pow(data.length, 2);
        int n = 0;

        for (int i = 0; i < loop; i++) {
            if(data[n] > data[n + 1])
            swap(data, n);

            n++;

            if((n + 1) >= data.length)
                n = 0;
        
            operationCount++;
        }



        return operationCount;
    }

    private static void swap(Integer[] data, int n) {
        
        int temp = data[n];
        data[n] = data[n + 1];
        data[n + 1] = temp;
    }

}
