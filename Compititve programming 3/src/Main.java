/**
 * Created by Jerry on 02-04-2017.
 */

// @JUDGE_ID:  1000AA  100  Java  "Easy algorithm"

import java.io.*;
import java.util.*;

public class Main {

    private static Map<String, Integer> map;

    static String a = "abcdefghijklmnopqrstuvwxyz";

    static void ReadLn() throws IOException  // utility function to read from stdin
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(getDecode(line));
        }

    }


    static void generate() {
        map = new TreeMap<String, Integer>();
        int i, j, k, m, n;
        int p = 1;
        String s, s1, s2, s3, s4, s5;
        for (i = 0; i < 26; i++) {
            s = a.charAt(i) + "";
            map.put(s, p);
            p++;
        }
        for (i = 0; i < 26; i++) {
            for (j = i + 1; j < 26; j++) {
                s = a.charAt(i) + "" + a.charAt(j) + "";
                map.put(s, p);
                p++;
            }
        }
        for (i = 0; i < 26; i++) {
            for (j = i + 1; j < 26; j++) {
                for (k = j + 1; k < 26; k++) {
                    s = a.charAt(i) + "" + a.charAt(j) + "" + a.charAt(k) + "";
                    map.put(s, p);
                    p++;
                }
            }
        }
        for (i = 0; i < 26; i++) {
            for (j = i + 1; j < 26; j++) {
                for (k = j + 1; k < 26; k++) {
                    for (m = k + 1; m < 26; m++) {
                        s = a.charAt(i) + "" + a.charAt(j) + "" + a.charAt(k) + "" + a.charAt(m) + "";
                        map.put(s, p);
                        p++;
                    }
                }
            }
        }
        for (i = 0; i < 26; i++) {
            for (j = i + 1; j < 26; j++) {
                for (k = j + 1; k < 26; k++) {
                    for (m = k + 1; m < 26; m++) {
                        for (n = m + 1; n < 26; n++) {
                            s = a.charAt(i) + "" + a.charAt(j) + "" + a.charAt(k) + "" + a.charAt(m) + "" + a.charAt(n) + "";
                            map.put(s, p);
                            p++;
                        }
                    }
                }
            }
        }

    }

    static int getDecode(String str) {
        return (map.containsKey(str)) ? map.get(str) : 0;
    }

    public static void main(String args[]) throws IOException  // entry point from OS
    {
        generate();
        ReadLn();           // the true entry point
    }

    public int[] twoSum(int[] numbers, int target) {

        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] > target)
                high--;

            else
                low++;
        }
        return null;
    }


}
