import java.util.*;
public class ARRAY {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] =  new int[n];
        for(int i =0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        int min  = arr[0];
        int max  = arr[0];

        //Find min and max in the array
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        // Arrays.sort(arr);
        // System.out.println(arr[0]+ " Min");
        // System.out.println(arr[arr.length-1] + " Max");
        System.out.println("Minimum value in array is " + min);
        System.out.println("Maximum value in array is " + max);
        sc.close();
    }
}


