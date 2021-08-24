
package fahrenheit_to_celsius;

import java.util.Scanner;

public class FahrenheitToCelcius {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double F, C;
        
        System.out.print("In Fahrenheit : ");
        F = input.nextDouble();
        
        C = (5*(F-32)/9);
        
        System.out.println("In Celsius : "+C);
    }
}
