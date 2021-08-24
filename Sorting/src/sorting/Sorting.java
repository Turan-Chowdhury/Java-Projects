
package sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int k, n=5, temp;
        int[] a = new int[5];
        
        System.out.print("Enter 5 Integers : ");
        
        for(int i=0; i<5; i++)
            a[i] = input.nextInt();
        
        for(int p=0; p<n-1; p++){
            k = 0;
            while(k<n-p-1){
                if(a[k]>a[k+1]){
                    temp = a[k];
                    a[k] = a[k+1];
                    a[k+1] = temp;
                }
                k++;
            }
        }
        
        System.out.print("After Sorting : ");
        
        for(int i=0; i<5; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    
}
    
