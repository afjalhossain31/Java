package labassignment;

import java.util.Scanner;
public class ArrayMax {
    double[] number= new double[6];
    
     void display(){
         Scanner input =new Scanner(System.in);
         double[] number =new double[6];
         System.out.print("Enter Six Number :");
         
         for(int i=0; i<=5; i++){
             number[i]=input.nextDouble();
         }
         double max =number[0];
         for(int i=1; i<=5; i++){
             if(max<number[i]){
                 max=number[i];
             }
         }
         System.out.println("Maximum Value ="+max);
     }
     public static void main(String[] args) {
        ArrayMax Maximum =new ArrayMax();
        Maximum.display();
    }
}
