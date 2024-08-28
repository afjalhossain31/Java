package labassignment;

public class PrimeNumberObject {
     int  count=0, totalNumber=0;
     
     void display(){

         for(int i=1; i<=100; i++){
             for(int j=2; j<=i-1; j++){
                 if( i%j == 0){
                    count++;
                    break; 
                 }
             }
             if(count == 0){
             System.out.print(" "+i);
             totalNumber++;
         }
         count=0;
         }
         System.out.println(" ");
         System.out.print("Total Prime Number : "+totalNumber);
         System.out.println("\n");
     }
     public static void main(String[] args) {
        PrimeNumberObject Prime_value = new PrimeNumberObject();
        Prime_value.display();
    }
     
     
}


     
    

