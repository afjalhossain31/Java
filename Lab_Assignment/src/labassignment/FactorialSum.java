
package labassignment;

import java.util.Scanner;
public class FactorialSum {
    
    void display(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n=input.nextInt();
        double sum=0;
        
        for(int i=1; i<=n; i++){
            int factorial=1;
            for(int j=1; j<=i; j++){
                factorial *=j;
            }
            sum +=(double)i/ factorial;
        }
        System.out.println("the sum of the series up to "+n+" Terms is :"+sum);
    }
    public static void main(String[] args) {
        FactorialSum Object =new FactorialSum();
        Object.display();
    }  
}
