public static String getSmallestAndLargest(String s, int k) {
        String curr_substring = s.substring(0, k);
        String smallest = curr_substring;
        String largest = curr_substring;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for (int i = 0; i <= s.length() - k; i++) {
            curr_substring = s.substring(i,i+k);
            
            if (curr_substring.compareTo(smallest) < 0) {
                smallest = curr_substring;
            }
            
            if (curr_substring.compareTo(largest) > 0) {
                largest = curr_substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

