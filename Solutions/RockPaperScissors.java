import java.util.*;

public class UserMainCode {
    private static final int MOD = 1000000007;

    public int countWinningSequences(int N, String handSigns) {
        int[][][] dp = new int[N][3][2];
        for (int i = 0; i < 3; i++) {
            dp[0][i][0] = (handSigns.charAt(0) == 'R' && i == 2) || (handSigns.charAt(0) == 'P' && i == 0) || (handSigns.charAt(0) == 'S' && i == 1) ? 1 : 0;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        dp[i][j][1] = (dp[i][j][1] + dp[i - 1][k][0]) % MOD;
                        dp[i][j][0] = (dp[i][j][0] + dp[i - 1][k][1]) % MOD;
                        dp[i][j][0] = (dp[i][j][0] + dp[i - 1][k][0]) % MOD;
                    }
                }
                if ((handSigns.charAt(i) == 'R' && j == 2) || (handSigns.charAt(i) == 'P' && j == 0) || (handSigns.charAt(i) == 'S' && j == 1)) {
                    dp[i][j][0]++;
                    dp[i][j][0] %= MOD;
                }
            }
        }

        int totalWinningSequences = 0;
        for (int j = 0; j < 3; j++) {
            totalWinningSequences = (totalWinningSequences + dp[N - 1][j][0]) % MOD;
            totalWinningSequences = (totalWinningSequences + dp[N - 1][j][1]) % MOD;
        }

        return totalWinningSequences;
    }
}
