
package projectshope;


import java.util.Scanner;

public class ProjectShope {
    ProjectShope(){
        System.out.println("Hi,Welcome to Our Project. What do you want to work with?");
        System.out.println("1.Circle\n 2.Triangle \n3.Square ");
        Scanner Sc=new Scanner(System.in);
        int  n=Sc.nextInt();
        
        if(n==1){
            System.out.println("Enter radius :");
            radius=Sc.nextDouble();
        }
        
        if(n==2){
            System.out.println("Enter the three sides of your triangle :");
            triangle_1=Sc.nextDouble();
             triangle_2=Sc.nextDouble();
              triangle_3=Sc.nextDouble();  
        }
        
        if(n==3){
            System.out.println("Enter the side of your Square :");
            square_side=Sc.nextDouble();
        }
        
    }
    public double radius;
    public double triangle_1,triangle_2,triangle_3;
    public double square_side;
    public class triangle extends ProjectShope{
        int peri(int a,int b, int c){
            return a+b+c;
        }
        double peri(double a,double b, double c){
            double sum=a+b+c;
            System.out.println(sum);
            return sum;
        }
        public static void main(String[] args) {
            triangle_1 object_1=new triangle();
            System.out.println("Area of your traiangle is:");
            double s=object_1.triangle_1+object_1.triangle_2+object_1.triangle_3;
            s/=2;
            
            double ans_1=s*(s-object_1.triangle_1)*(s-object_1.triangle_2)*(s-object_1.triangle_3);
            double ans_2=Math.sqrt(ans_1);
            System.out.println(ans_2);
            
            int a=3,b=4,c=7;
            int peri_1=object_1.peri(a, b, c);
            
            double peri_2=object_1.peri(object_1.triangle_1, object_1.triangle_2,object_1.triangle_3);
            System.out.println("Perimeter of the triangle :"+peri_1);
            System.out.println("Perimeter of the triangle :"+peri_2);
            
        }
        
        public class circle extends ProjectShope{
            public static void main(String[] args) {
                circle object_2=new circle();
                System.out.println("Arera of circle is :");
                double r=object_2.radius;
                double ans=3.1416*r*r;
                System.out.println(ans);
            }
        }
  
    }
    
}
