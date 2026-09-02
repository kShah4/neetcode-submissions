class Solution {
    String countSubstrings(String s) {
    int start = 0, maxLen = 0;

    for (int i = 0; i < s.length(); i++) {
        int len1 = expand(s, i, i);       // odd length, center at i
        int len2 = expand(s, i, i + 1);   // even length, center between i and i+1
        int len = Math.max(len1, len2);

        if (len > maxLen) {
            maxLen = len;
            start = i - (len - 1) / 2;    // recompute the start index from center + length
        }
    }
    return s.substring(start, start + maxLen);
}

int expand(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    return right - left - 1;   // length of the palindrome found
}
}
