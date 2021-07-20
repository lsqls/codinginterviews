package src;

public class JZ19 {
    // 状态定义： 设动态规划矩阵 dp ， dp[i][j] 代表字符串 s 的前 i 个字符和 p 的前 j 个字符能否匹配。
    
    // 转移方程： 需要注意，由于 dp[0][0] 代表的是空字符的状态， 因此 dp[i][j] 对应的添加字符是 s[i - 1] 和 p[j - 1] 。
    public boolean isMatch(String s, String p) {
        int m = s.length() + 1, n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;

        // 当 p 的偶数位为 * 时才能够匹配，即让 p 的奇数位出现 0 次，保持 p 是空字符串
        for(int j = 2; j < n; j += 2)
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(p.charAt(j-1)=='*'){ //观察 p[j-2]
                    dp[i][j] =( dp[i][j - 2] ) || //将字符组合 p[j - 2] * 看作出现 0 次时
                    (dp[i - 1][j] && s.charAt(i - 1) == p.charAt(j - 2)) ||  // 字符 p[j - 2] 多出现 1 次时
                    (dp[i - 1][j] && p.charAt(j - 2) == '.'); // 让字符 '.' 多出现 1 次时
                }
                else{//观察 p[j-1]
                    dp[i][j] = (dp[i - 1][j - 1] && p.charAt(j - 1) == '.' ) || // p[j - 1] 多出现一次时，能否匹配；
                    (dp[i - 1][j - 1] && s.charAt(i - 1) == p.charAt(j - 1)); // 即将字符 . 看作字符 s[i - 1] 时
                }

                
            }
        }
        return dp[m - 1][n - 1];
    }
}
