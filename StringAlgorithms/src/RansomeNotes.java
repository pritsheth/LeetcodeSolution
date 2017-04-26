/**
 * Created by Jerry on 27-03-2017.
 */
public class RansomeNotes {

    public boolean canConstruct(String ransomNote, String magazine) {

        char[] magazineChars = magazine.toCharArray();
        int dp[] = new int[26];
        char[] ranSomeChars = ransomNote.toCharArray();
        int ranDp[] = new int[26];

        for (int i = 0; i < magazineChars.length; i++) {
            dp[magazineChars[i] - 'a']++;
        }


        for (int i = 0; i < magazineChars.length; i++) {
            if (dp[ranSomeChars[i] - 'a'] > 0) {
                dp[ranSomeChars[i] - 'a']--;
            } else
                return false;
        }
        return true;
    }
}
