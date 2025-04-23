//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int arr[] ={2,4,12,43,98,3,6,8,9,34,54,76};
        System.out.println("Chỉ số của 9:");
        System.out.println(search(arr,9));
        System.out.println("Chỉ số của 54:");
        System.out.println(search(arr,54));
        System.out.println("Chỉ số của 12:");
        System.out.println(search(arr,12));
        System.out.println("Chỉ số của 21");
        System.out.println(search(arr,21));
        System.out.println("Chỉ số của 13");
        System.out.println(search(arr,13));


    }
    public static int search(int[] arr, int target) {
        int index=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                index=i;
                break;
            }
        }return index;
    }
}