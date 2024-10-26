// T.C=0(n*(n+n))=0(2n*n)=0(n*n);
class Solution {
    // Function to count all palindromic substrings in the given string
    public int countSubstrings(String s) {
        int count = 0; // Initialize a counter for palindromic substrings

        // Loop through each character as a potential center of a palindrome
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes centered at 'i'
            count += find(s, i, i); 

            // Check for even-length palindromes centered between 'i' and 'i+1'
            count += find(s, i, i + 1);
        }
        return count; // Return the total count of palindromic substrings
    }

    // Helper function to find and count palindromic substrings centered at given indices
    public int find(String s, int left, int right) {
        int count = 0; // Local counter for palindromic substrings in this expansion

        // Expand as long as 'left' and 'right' characters match and are within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; // Increment count for each valid palindrome found
            left--;  // Move left pointer outward
            right++; // Move right pointer outward
        }
        return count; // Return the count of palindromic substrings for this center
    }
}
