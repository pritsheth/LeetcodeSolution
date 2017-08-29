import java.util.Stack;

/**
 * Created by Jerry on 29-07-2017.
 */
public class ValidAnagrams {


    public boolean isAnagram(String s, String t) {

        return true;
    }

    public static void main(String[] args) {

        String ex[] = {"<><>"};
        int factors[] = {1};
balanceOrNot(ex,factors);

    }

    static int balanceOrNot(String[] ex,int[] factors){

        int answers[] = new int[ex.length];
        for (int i = 0; i < ex.length; i++) {
            answers[i] = isBalanceOrNot(ex[i],factors[i]);
            System.out.println(answers[i]);
        }
return 0;
    }

    private static int isBalanceOrNot(String ex, int factor) {

        char[] chars = ex.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        stack.push(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == '<'){
                stack.push(chars[i]);
            }

            else if(chars[i] == '>'){
                Character peek = stack.peek();
                if(peek == '<')
                    stack.pop();
                else
                    stack.push('>');
            }

        }

        for (a:stack) {
          if(stack.peek)
        }
        return (stack.size() <= factor) ? 1 : 0;
    }
}
