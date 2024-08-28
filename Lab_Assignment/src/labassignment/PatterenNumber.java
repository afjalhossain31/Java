package labassignment;
import java.util.Scanner;

public class PatterenNumber {
    int n; 
    void display(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :");
        n=input.nextInt();
        
        for(int i=1; i<=n; i++){
             for(int j=1; j<=i;j++){
                 System.out.print(" "+j);
             }
             System.out.println(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PatterenNumber Object =new PatterenNumber();
        Object.display();
    }   
}
