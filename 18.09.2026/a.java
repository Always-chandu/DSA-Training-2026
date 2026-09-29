import java.util.*;
public class a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int org = a;
        int c = 0 ;
        int b = 0;
        int count = 0;
        int sum = 0;
        int evencount = 0 ;
        int oddcount = 0;
        int largest = 0;
        while(a!=0){
            b = a%10;
            c = c*10+b;
            if(b%2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
            if(b > largest){
                largest = b;
            }
            a = a/10;
            sum = sum+b;
            count++;
            

        }
        if(org == c){
            System.out.println("The numbere " + org + " is palindrome");
        }
        else{
            System.out.println("The number " + org + " is not palindrome");
        }
        System.out.println("The reverse number is : " + c);
        System.out.println("No. of digits in the number : " + count);
        System.out.println("The sum of digits in the number : " + sum);
        System.out.println("The largest digit in the number : " + largest);
        System.out.println("The number of even digits in the number : " + evencount);
        System.out.println("The number of odd digits in the number : " + oddcount);
    }
}
