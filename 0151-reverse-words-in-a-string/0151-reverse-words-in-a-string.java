class Solution {
    public String reverseWords(String s) {
        // Split the input string into an array of words
        String[] words = s.split("\\s+");

        // Initialize a StringBuilder for efficient string concatenation
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order with a space between them
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Trim any leading or trailing spaces and convert StringBuilder to String
        return reversed.toString().trim();
    }
}
