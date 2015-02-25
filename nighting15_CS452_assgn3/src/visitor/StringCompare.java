package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to compare strings
 *
 * @author Taylor Nightingale
 */
public class StringCompare {

    public static void main(String args[]) {
        System.out.println("Difference between sitting and kitten: " + stringDifference("sitting", "kitten"));
        System.out.println("Is sitting similar to kitten: " + areStringsSimilar("sitting", "kitten"));
        System.out.println("==========================================");
        System.out.println("Difference between sitting and aittung: " + stringDifference("sitting", "aittung"));
        System.out.println("Is sitting similar to aittung: " + areStringsSimilar("sitting", "aittung"));
        System.out.println("==========================================");
        System.out.println("Difference between kitten and itten: " + stringDifference("kitten", "itten"));
        System.out.println("Is kitten similar to itten: " + areStringsSimilar("kitten", "itten"));
        System.out.println("==========================================");
        System.out.println("Difference between Abc and Lib: " + stringDifference("Abc", "Lib"));
        System.out.println("Is Abc similar to Lib: " + areStringsSimilar("Abc", "Lib"));
    }

    /**
     * Finds the first string that is similar, or null if none is found.
     *
     * @param base the string to compare against
     * @param strings a list of strings to find a similar one
     * @return the first similar string, or null if no strings are similar to the base.
     */
    public static String whichStringIsSimilar(String base, List<String> strings) {
        for(String t: strings) {
            if(areStringsSimilar(base, t)) {
                return t;
            }
        }
        return null;
    }

    /**
     * Determines if two strings are "similar." That is there requires only
     * two changes to make the strings the same. Note, this function does
     * not take case into account.
     *
     * @param str0 the first string to compare
     * @param str1 the second string to compare
     * @return true if the strings are similar, false otherwise
     */
    public static boolean areStringsSimilar(String str0, String str1) {
        if(str0 == null || str1 == null) return false;
        return stringDifference(str0.toLowerCase(), str1.toLowerCase()) < 3;
    }

    /**
     * Finds the difference between two strings. That is, the
     * number of changes to transform one string into another.
     *
     * @param str0 the first string to compare
     * @param str1 the second string to compare
     * @return the number of changes to transform s into t.
     */
    public static int stringDifference(String str0, String str1) {
        // Assign the larger string to t
        String s, t;
        if(str0.length() < str1.length()) {
            s = str0;
            t = str1;
        }
        else {
            s = str1;
            t = str0;
        }

        // Easy cases
        if(s.equals(t)) return 0;
        if(s.length() == 0) return t.length();
        if(t.length() == 0) return s.length();

        // Arrays for comparisons
        int[] previous = new int[t.length() + 1]; // the row of previous differences
        int[] current = new int[t.length() + 1]; // the row of current differences

        // Initialize previous and current to 0's
        for(int i = 0; i < previous.length; i++) {
            previous[i] = i;
        }

        // Delete a character from one s, then t, then both and find the minimum difference.
        for(int i = 0; i < s.length(); i++) {
            current[0] = i + 1;

            for(int j = 0; j < t.length(); j++) {
                // add a cost if the chars at pos j are not the same
                int cost;
                if(s.charAt(i) == t.charAt(j)) {
                    cost = 0;
                }
                else {
                    cost = 1;
                }

                int minimum = Math.min(previous[j] + cost, Math.min(current[j] + 1, previous[j + 1]));
                current[j + 1] = minimum;
            }

            // Copy over
            for(int j = 0; j < previous.length; j++) {
                previous[j] = current[j];
            }
        }

        return current[t.length()];
    }

}
