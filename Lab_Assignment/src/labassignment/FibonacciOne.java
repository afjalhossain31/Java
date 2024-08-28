package labassignment;

import java.util.Scanner;

public class FibonacciOne {
           int i, m = 0, next= 1,num, temp;
           
         void display(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Any Number :");
        num=input.nextInt();
        
        for ( i = 1; i <=num; i++) {
            System.out.println("  " + m);
            temp = m + next;
            m = next;
            next = temp;
        }
             System.out.println();
    }
    
    public static void main(String[] args) {
       
        FibonacciOne object = new FibonacciOne();
        object.display();
    }
    
}
