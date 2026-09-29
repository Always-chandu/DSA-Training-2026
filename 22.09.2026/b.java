//https://codeforces.com/problemset/problem/546/A
import java.util.*;
public class b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        
        
        int total = 0;
        for(int i = 1 ; i<=w ; i++){
            total = total + i*k;
        }
        int borrow = total - n;
        if(borrow > 0){
            System.out.println(borrow);
        } else {
            System.out.println(0);
        }
    }
}
