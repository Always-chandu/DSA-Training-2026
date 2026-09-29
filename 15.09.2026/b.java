// 1. Productive Training Days – ITM University

// During a coding training program at ITM University, a student practices coding for N days. On day i, the student solves A[i] coding problems.

// A day is called a Productive Day if:

// The student solves at least 10 problems, and
// The number of problems solved is even.

// Your task is to find the number of Productive Days.

// Input
// 6
// 5 10 12 7 15 20
// Output
// 3
// Explanation

// The student solves:

// 5 → Not Productive
// 10 → Productive
// 12 → Productive
// 7 → Not Productive
// 15 → Not Productive (odd)
// 20 → Productive

// Therefore, the total number of Productive Days = 3.
import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Days : ");
        int a = sc.nextInt();
        int c = 0;
        for(int i = 0 ; i < a ; i++){
            int b = sc.nextInt();
            if(b%2==0 && b>= 10){
                c++;
            }
        }
        System.out.println("No. of productive days are : "+c);
        sc.close();
    }
}
