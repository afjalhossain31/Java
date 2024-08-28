package labassignment;

import java.util.Scanner;
public class SumOfNumber {
    int n, sum=0;
    void display(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Any Number :");
        n=input.nextInt();
        
        for(int i=1; i<=n; i++){
            sum= sum+i*i;
            System.out.print(" + "+i*i);
        }
        System.out.println(" ");
        System.out.println("Result ="+sum);
    }
    
    public static void main(String[] args) {
        SumOfNumber Object= new SumOfNumber();
        Object.display();
    }  
}
