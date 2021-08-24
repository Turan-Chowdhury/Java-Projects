
package decimal_to_binary;

import java.util.Scanner;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int d, x, index;
        int[] b = new int[50];
        
        System.out.print("In Decimal : ");
        d = input.nextInt();
        
        x = d;
        index = -1;
        
        while (x != 0) {
            index++;
            b[index] = x%2;
            x/=2;
        }
        
        System.out.print("In Binary : ");
        
        for(int i=index; i>=0; i--){
            System.out.print(b[i]);
        }
        System.out.println();
    }
    
}
