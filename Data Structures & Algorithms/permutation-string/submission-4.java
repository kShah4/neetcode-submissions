class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int count = freqMap.size();

        int l = 0;

        for (int r = 0; r < s2.length(); r++) {

            // Add right character into window
            char c = s2.charAt(r);

            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) - 1);

                if (freqMap.get(c) == 0) {
                    count--;
                }
            }

            // If window becomes bigger than s1
            if (r - l + 1 > s1.length()) {

                char leftChar = s2.charAt(l);

                if (freqMap.containsKey(leftChar)) {

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

            // Check when window size == s1 length
            if (r - l + 1 == s1.length() && count == 0) {
                return true;
            }
        }

        return false;
    }
}