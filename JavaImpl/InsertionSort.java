import java.util.Arrays;
import java.util.Scanner;
class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j = i;
            while (j>0 && (arr[j] < arr[j-1])){
                //swapping the values
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arrSize = input.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0;i<arrSize;i++){
            System.out.print("Enter the element"+i+":");
            int element = input.nextInt();
            arr[i] = element;
        }
        System.out.println("Array before sorting"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting"+ Arrays.toString(arr));
        input.close();
    }
}