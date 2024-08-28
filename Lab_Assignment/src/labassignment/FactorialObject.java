package labassignment;

import java.util.Scanner;

public class FactorialObject {
     int n, m, num=1;
     void display(){
         Scanner input =new Scanner(System.in);

  System.out.println("Enter Any Number :");
  n=input.nextInt();
   for(int i=1; i<=n; i++){
       
       num=num* i;
       System.out.println( "Number = "+num);
   }
         System.out.println();
     }  
    public static void main(String[] args) {
        FactorialObject Object= new FactorialObject();
                Object.display();
    }   
}
