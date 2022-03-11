public class MagicIndex {

    public static void main(String [] args){

        int arr[] = {-10,-5,2,2,2,3,4,7,9,12,13};

        int startEle = 0;
        int endEle = arr.length -1 ;

        System.out.println(returnMagicIndex(arr));

        System.out.println(returnMagicIndexRecursive(arr, startEle, endEle));

        System.out.println(returnMagicIndexRecursiveNotDistinct(arr, startEle, endEle));
    }



//    Brute force solution = O(n) - time || O(n) - space complexity || arrays
//    Solution 1
//    private static int returnMagicIndex(int[] arr) {
//        int length = arr.length;
//        for(int i=0; i<length; i++){
//            if(arr[i] == i){
//                return i;
//            }
//        }
//        return -1;
//    }

//    Solution 2 - Iterative approach
//    Arrays is sorted - we can use binary search to reduce the time to O(logn)
    private static int returnMagicIndex(int[] arr) {

        int startIdx = 0;
        int endIdx = arr.length;

        while (startIdx <= endIdx){
            int midIdx = (startIdx + (endIdx - startIdx)) / 2;
            if(arr[midIdx] == midIdx){
                return midIdx;
            } else if(arr[midIdx] < midIdx){
                endIdx = midIdx - 1;
            } else{
                startIdx = midIdx + 1;
            }
        }

        return -1;
    }

//    Solution 3 - Recursive approach
    private static int returnMagicIndexRecursive(int[] arr, int startEle, int endEle) {

    if(endEle < startEle) return -1;
    int midIdx = (startEle + (endEle - startEle)) / 2;
        if(arr[midIdx] == midIdx){
            return midIdx;
        } else if(arr[midIdx] < midIdx){
            endEle = midIdx - 1;
            return returnMagicIndexRecursive(arr, startEle, endEle);
        } else{
            startEle = midIdx + 1;
            return returnMagicIndexRecursive(arr, startEle, endEle);
        }
    }

//    if the array is not distinct

    private static int returnMagicIndexRecursiveNotDistinct(int[] arr, int startEle, int endEle) {

        if(endEle < startEle) return -1;
        int midIdx = (startEle + (endEle - startEle)) / 2;
        if(arr[midIdx] == midIdx){
            return midIdx;
        }
        int midValue = arr[midIdx];
        int leftIdx = Math.min(midIdx - 1, midValue);
        int left = returnMagicIndexRecursiveNotDistinct(arr, startEle, leftIdx);
        if(left >= 0){
            return left;
        }

        int rightIdx = Math.max(midIdx + 1, midValue);
        int right = returnMagicIndexRecursiveNotDistinct(arr, rightIdx, endEle);

        return right;
    }
}
