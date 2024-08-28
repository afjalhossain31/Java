
package labassignment;
import java.util.Scanner;

public class SumOfOddNumber {
    int n, result=0;
    
    void display(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Ending Number : ");
        n=input.nextInt();
        
        for(int i=1; i<=n; i++){
            if(i%2 !=0){
                System.out.print(" "+i);
                System.out.print("+");
            }
            result= result +i;
        }
        System.out.println("");
        System.out.println("Result ="+result);
    }
    public static void main(String[] args) {
        SumOfOddNumber Odd= new SumOfOddNumber();
        Odd.display();
    }   
}
