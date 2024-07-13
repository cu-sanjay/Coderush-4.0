import java.util.*;

public class UserMainCode {
    public int[] findArrayB(int input1, int[] input2, int input3) {
        int n = input1;
        int[] A = input2;
        int X = input3;

        int[] B = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            B[i] = 0; 
            for (int j = 0; j <= 30; j++) { 
                if ((sum + (A[i] & (1 << j))) <= X) {
                    B[i] = (1 << j);
                    sum += A[i] & B[i];
                    break;
                }
            }
        }

        if (sum != X) {
            return new int[]{-1};
        }
        return B;
    }
}
