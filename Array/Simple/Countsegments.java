public class Countsegments {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,4,5,-6};
        int result = countSegments(arr);
        System.out.println("Segment are : " + result);
    }
    static int countSegments(int[] arr){
        int count = 1;
        for(int i=1;i<arr.length;i++){
            boolean currNonNeg = arr[i]>=0;
            boolean prevNonNeg = arr[i-1]>=0;

            if(currNonNeg != prevNonNeg){
                count++;
            }
        }
        return count;
    }
}
