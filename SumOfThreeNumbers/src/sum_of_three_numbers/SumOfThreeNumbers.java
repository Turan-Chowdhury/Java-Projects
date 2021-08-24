
package sum_of_three_numbers;

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.print("Enter three numbers : ");
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        System.out.println("SUM : "+(a+b+c));
    }
    
}
