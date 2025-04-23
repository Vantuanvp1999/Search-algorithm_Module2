import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[]={21,43,54,2,4,8,9,5,4,65,44};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,(arr.length-1),2));
    }
    public static int binarySearch(int[] arr,int left,int right, int target) {

       while (left <= right) {
           int mid = (left + right) / 2;
        if(arr[mid] == target) {
            return mid;
        }else if (arr[mid] > target) {
            right = mid - 1;
        }else if (arr[mid] < target) {
            left = mid + 1;
        }
       }return -1;
    }
}