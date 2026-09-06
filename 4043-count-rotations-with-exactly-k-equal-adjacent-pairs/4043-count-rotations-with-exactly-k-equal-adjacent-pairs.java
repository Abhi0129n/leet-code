class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int totalEqual = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                totalEqual++;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int excluded = (s.charAt(i) == s.charAt((i + 1) % n)) ? 1 : 0;

            if (totalEqual - excluded == k) {
                count++;
            }
        }

        return count;
    }
}