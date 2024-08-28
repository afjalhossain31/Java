
package labassignment;

import java.util.Scanner;

public class SwappingObject {
    int a,b, temp;
     void display(){
         Scanner input =new Scanner(System.in);
         System.out.print("Enter two Number :");
         a=input.nextInt();
         b=input.nextInt();
         System.out.println("Before Swapping : "+a +" "+b);
         
         temp= a;
         a= b;
         b= temp;
         System.out.println("After Swawpping :"+ a+" "+b);
     }
     public static void main(String[] args) {
         SwappingObject Number =new  SwappingObject();
         Number.display();
    }    
}
