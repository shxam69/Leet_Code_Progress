class Solution {
    public String addBinary(String a, String b) {

        String result = "";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            // Must be >= 0, otherwise index 0 gets skipped
            if (i >= 0) {
                sum = sum + (a.charAt(i) - '0');
                i--;
            }

            if (j >= 0) {
                sum = sum + (b.charAt(j) - '0');
                j--;
            }

            // Add current answer digit to the FRONT
            result = (sum % 2) + result;

            // Calculate carry
            carry = sum / 2;
        }

        return result;
    }
}