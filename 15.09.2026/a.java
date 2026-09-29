import java.util.*;
public class a {
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
