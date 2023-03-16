package problems.arrays;


/**
 * Given an input string, reverse the string word by word.
 * For example, given s = "the sky is blue", return "blue is sky the".
 */
public class ReverseWordsInString
{

    public static void main(String[] args)
    {
        String toReverse = "The field is green";
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        System.out.println(reverseWordsInString.reverseWords(toReverse));
    }

    public String reverseWords(String s)
    {
        if (s == null || s.length() == 0)
        {
            return "";
        }
        // split to words by space
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; --i)
        {
            if (!arr[i].equals(""))
            {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
}
