package labassignment;

import java.util.Scanner;
public class DiomondObject {
    int  i,j,k,n;
    void display(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Number Of Rows : ");
        n=input.nextInt();
        
        for( i=1; i<=n; i++){
            
            for( j=n; j>i; j--){
                System.out.print(" ");
            }
            
            for( k=1; k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        for( i = n-1; i>=1; i--){
            
            for( j=n; j>i; j--){
                System.out.print(" ");
            }
            for( k=1; k<=(2*i-1); k++){
                
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        DiomondObject patternt =new DiomondObject();
        patternt.display();
    }
}
