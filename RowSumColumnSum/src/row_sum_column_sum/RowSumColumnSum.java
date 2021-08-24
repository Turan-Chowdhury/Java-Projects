
package row_sum_column_sum;

import java.util.Scanner;

public class RowSumColumnSum {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] A = new int[2][3];
        int[] rs = {0,0};
        int[] cs = {0,0,0};
        
        System.out.println("Inut a 2*3 matrix : ");
        
        for(int i=0; i<2; i++)
            for(int j=0; j<3; j++){
                A[i][j] = input.nextInt();
                rs[i] += A[i][j];
                cs[j] += A[i][j];
            }
        
        System.out.println();
        
        System.out.print("Row Sum : ");
        for(int i=0; i<2; i++)
            System.out.print(" "+rs[i]);
        
        System.out.println();
        
        System.out.print("Column Sum : ");
        for(int i=0; i<3; i++)
            System.out.print(" "+cs[i]);
        
        System.out.println();
    }
    
}
