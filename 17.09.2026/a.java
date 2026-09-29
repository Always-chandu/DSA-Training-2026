//Prime number cehck

import java.util.*;
public class a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int primecount = 0;
        int compositecount = 0;
        // for(int i=2; i<a; i++){
        //     if(a%i==0){
        //         System.out.println("Not a prime number");
        //         break;
        //     }
        //     else{
        //         System.out.println("Prime number");
        //         break;
        //     }
        // }
        // int n = a-1;
        // while(n-->2){
        //     if(a%n==0){
        //         System.out.println("Composite number");
        //         break;
        //     }
        //     else{
        //         System.out.println("Prime number");
        //         break;
        //     }

        // }
        for (int i = 2; i <= a; i++) {
            int g = i;
            boolean isPrime = true;
    
    // Using a separate variable 'j' so we don't mess up 'i'
            int j = i - 1; 
            while (j > 1) { 
                if (g % j == 0) {
                    isPrime = false;
                    break; 
            }
                j--;
            }
    
    // Print the result after checking all possible factors
            if (!isPrime && g%2==0) {
                System.out.println(g + " Composite number and also even ");
               compositecount++;
            } else if(!isPrime && g%2!=0  ) {
                System.out.println(g + " Composite number and also odd  ");
                compositecount++;
            } else if (isPrime && g%2==0) {
                System.out.println(g + " prime number and also even ");
                 primecount++;
            } else if(isPrime && g%2!=0  ) {
                System.out.println(g + " prime number and also odd  ");
                primecount++;
            }

            

}       
        System.out.println("Prime count " + primecount);
        System.out.println("Composite count " + compositecount);

        
    sc.close();
    }
}
