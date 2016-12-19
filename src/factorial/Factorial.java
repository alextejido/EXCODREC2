
package factorial;

import java.util.Scanner;


public class Factorial {


    public static void main(String[] args) {

        
   
 Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero para calcular el factorial");
        int n1 = sc.nextInt();
 
        
 System.out.println(factorial(n1));

  
   
    }

public static int factorial(int num){   
   
     int n2;
   if (num == 0)
    n2 = 1;
   else
   {
    n2 = 1;
for (int i = num; i >= 1; i--)
{
    n2 = n2 * i;
}
   }    
 return n2;
          }
  
}
 


    
    

 

    
    
