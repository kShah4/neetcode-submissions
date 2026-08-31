class Solution {
 int numDecodings(String s) {
    int n = s.length();
    char[] c = s.toCharArray();

    int prev2 = 1;                              // dp[0]
    int prev1 = (c[0] != '0') ? 1 : 0;           // dp[1]

    for (int i = 2; i <= n; i++) {
        int twoDigit = (c[i - 2] - '0') * 10 + (c[i - 1] - '0');

        int curr = (c[i - 1] != '0' ? prev1 : 0)
                 + (twoDigit >= 10 && twoDigit <= 26 ? prev2 : 0);

        prev2 = prev1;   // shift window forward
        prev1 = curr;
    }
    return prev1;
}
}
