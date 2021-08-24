
package getting_user_input;

import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i;
        float f;
        double d;
        char c;
        String s, dummy;
        
        System.out.print("Enter an Integer Number : ");
        i = input.nextInt();
        System.out.println("i = "+i);
        
        System.out.print("Enter a Float Number : ");
        f = input.nextFloat();
        System.out.println("f = "+f);
        
        System.out.print("Enter a Double Number : ");
        d = input.nextDouble();
        System.out.println("d = "+d);
        
        System.out.print("Enter a Single Word : ");
        s = input.next();
        System.out.println("s = "+s);
        
        dummy = input.nextLine();
        
        System.out.print("Enter a line : ");
        s = input.nextLine();
        System.out.println("s = "+s);
        
        System.out.print("Enter a Character : ");
        c = input.next().charAt(0);
        System.out.println("c = "+c);
    }
    
}
