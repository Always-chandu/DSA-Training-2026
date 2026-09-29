//https://codeforces.com/problemset/problem/617/A
import java.util.*;
public class A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(a>0){
            if(a>=5){
                a = a-5;
                count++;
            } else if(a>=3){
                a = a-3;
                count++;
            } else if(a>=2){
                a = a-2;
                count++;
            } else if(a>=1){
                a = a-1;
                count++;
            }
        }
        System.out.println(count);
    }
}
