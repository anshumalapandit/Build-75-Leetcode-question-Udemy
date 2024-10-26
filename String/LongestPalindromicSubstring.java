// T.C= 0(n2)
class Solution {
    int start = 0; // Start index of the longest palindromic substring found
    int end = 0;   // End index of the longest palindromic substring found

    // Function to find the longest palindromic substring in a given string
    public String longestPalindrome(String s) {
        // Check each character as a possible center of a palindrome
        for (int i = 0; i < s.length(); i++) {
            // Expand around one character (for odd-length palindromes)
            ExpandAroundCenter(s, i, i);
            // Expand around two consecutive characters (for even-length palindromes)
            ExpandAroundCenter(s, i, i + 1);
        }
        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around a center and find the longest palindrome
    private void ExpandAroundCenter(String s, int left, int right) {
        // Expand while characters at left and right are the same
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;   // Move left pointer one step left
            right++;  // Move right pointer one step right
        }
        // Adjust indices to last matching pair for valid palindrome
        left=left+1;
        right=right-1;

        // Update start and end if the current palindrome is longer
        if (end - start < right - left) {
            start = left;
            end = right;
        }
    }
}
