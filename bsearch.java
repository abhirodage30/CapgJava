public class bsearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7};
        int target = 5;
        int ans = 0;
        int s =0;
        int e = arr.length-1;
        int mid = s+(e-s)/2;
        while (s<=e) {
            if(arr[mid]==target){
                ans = mid;
                break;
            }
            else if(arr[mid]>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        System.out.println(ans);
    }
}
