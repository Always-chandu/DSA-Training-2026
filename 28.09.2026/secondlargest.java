import java.util.*;

public class secondlargest {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++ ){
            arr[i] = sc.nextInt();
        }

        // Arrays.sort(arr);
        // System.out.println("Second largest of the array is : " + arr[n-2]);

        int Largest = Integer.MIN_VALUE ; 
        int Secondlargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > Largest){
                Secondlargest = Largest;
                Largest = arr[i];
            }else{
                Secondlargest = arr[i];
            }
        }
        System.out.println(Secondlargest + " Is the second largest number ");

    }
}
