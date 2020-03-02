public class Mountain {
    public static void main(String[] args) {
        int [] arr = {99, 33, 55, 77, 55};

        System.out.println(getPeakIndex(arr));

        int [] arr1 = {1, 4, 2, 1,0};
        System.out.println(getPeakIndex(arr1));
        System.out.println(isMountain(arr1));
    }

    // a.
   public static int getPeakIndex(int[] array){
       for (int i = 1; i<array.length; i++){
         if (array[i]>array[i-1] && array[i]>array[i+1]){
             return i;
         }
       }
       return -1;
   }

   // b.
    public static boolean isMountain(int [] array){
        int peakIndex = getPeakIndex(array);

        return isIncreasing(array, peakIndex) && isDecreasing(array, peakIndex);
    }

    public static boolean isIncreasing(int[] array, int stop){
        int count= 0;
        for (int i=0; i<stop; i++){
            if (array[i]<array[i+1]){
                count+=1;
            }
        }
        return count == stop;
    }

     public static boolean isDecreasing(int[] array, int start){
        int count= 0;
        for (int i=start; i<array.length-1; i++){
            if (array[i]>array[i+1]){
               count+=1;
            }
        }
        return count==start;
    }
}
