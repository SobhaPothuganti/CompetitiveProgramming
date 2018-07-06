public class FindinOrderedSet {

    public static boolean contains(int[] a, int n) {

        // check if an integer is present in the array
       int result = binarySearch(a,0,a.length-1,n);
        if (result == -1)
            return false;
        else
            return true; 

    } 
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return mid;
 
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
