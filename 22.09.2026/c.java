//69A - Young Physicist
import java.util.*;
public class c {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int totala = 0 ;
        int totalb = 0 ;
        int totalc = 0 ;
        for(int i = 0; i<a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            totala = totala + b;
            totalb = totalb + c;
            totalc = totalc + d;
        }
        if(totala == 0 && totalb == 0 && totalc == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
