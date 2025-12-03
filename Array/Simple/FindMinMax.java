public class FindMinMax {
    public static void main(String[] args) {

        int arr[] = {1,2,15,87,-55,-54}; 
        int[] result = Findminmax(arr);
        System.out.println(result );
       

    }
    public static int[] Findminmax(int[] arr){
        
        int min , max ,i;
        int n = arr.length;
        if (n % 2 ==1){
          min = max = arr[0];
          i=1;
        }
        else{
            if (arr[0]<arr[1]) {
                min = arr[0];
                max = arr[1];
            }
            else{
                min = arr[1];
                max = arr[0];
            }
            i=2;

        }
        while (i<n-1) {
            if (arr[i]<arr[i+1]){
                min = Math.min(min, arr[i]);
                max  = Math.max(max, arr[i+1]);
            }
            else{
                min = Math.min(min, arr[i+1]);
                max = Math.max(max, arr[i]);
            }
        }
        return new int[]{min,max};

    }
}
