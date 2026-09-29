// During a coding training program at ITM University, a student practices coding for N days. On day i, the student solves A[i] coding problems.

// A day is called an Improvement Day if the student solves at least 3 more problems than the previous day.

// The first day is never considered an Improvement Day.
// Find the total number of Improvement Days.
// Input
// 7
// 2 5 6 10 9 15 17
// Output
// 3
// Explanation

// Compare each day with the previous day:

// Day 2: 5 - 2 = 3 → Improvement Day
// Day 3: 6 - 5 = 1 → Not an Improvement Day
// Day 4: 10 - 6 = 4 → Improvement Day
// Day 5: 9 - 10 = -1 → Not an Improvement Day
// Day 6: 15 - 9 = 6 → Improvement Day
// Day 7: 17 - 15 = 2 → Not an Improvement Day

// Therefore, the total number of Improvement Days = 3.
import java.util.*;

public class c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int first = sc.nextInt();
        int previous = first; ;
        for(int i = 1 ; i < n ; i++){
            int current = sc.nextInt();
            if(current >= previous+3){
                count++;
            }
            previous = current;
        }
        System.out.println("Total productive Days : " + count);
        
        // int arr[] = new int[n];
        // for(int i = 0 ; i < n ; i++){
            
        //     if(i == 0){
        //         arr[i] = sc.nextInt();
                
        //     }
            
        //     if(i > 0){
        //         arr[i] = sc.nextInt();
        //         int previous1 = arr[i-1];
        //         if(arr[i] >= previous1 + 3){
        //             count++;
        //         }
        //         previous1 = arr[i];
        //     }

        // }
        // System.out.println("Total productive Days : " + count);
        sc.close();
    }
}
