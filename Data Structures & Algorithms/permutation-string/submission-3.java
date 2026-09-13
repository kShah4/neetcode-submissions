class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Number of unique characters that still need to be matched
        int count = freqMap.size();

        int l = 0;
        int r = 0;

        while (r < s2.length()) {

            // ADD s2[r] to the window
            char c = s2.charAt(r);

            if (freqMap.containsKey(c)) {

                freqMap.put(c, freqMap.get(c) - 1);

                // We matched all occurrences of this character
                if (freqMap.get(c) == 0) {
                    count--;
                }
            }

            r++;

            // If window became bigger than s1
            if (r - l > s1.length()) {

                char leftChar = s2.charAt(l);

                if (freqMap.containsKey(leftChar)) {

                    // If it was perfectly matched,
                    // removing it makes it unmatched again
                    if (freqMap.get(leftChar) == 0) {
                        count++;
                    }

                    freqMap.put(
                        leftChar,
                        freqMap.get(leftChar) + 1
                    );
                }

                l++;
            }

            // Window size == s1 length
            if (r - l == s1.length() && count == 0) {
                return true;
            }
        }

        return false;
    }
}