package palindromechecker;
import java.util.Scanner;

public class PalindromeChecker
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = false;
        String word;
        do {

            System.out.print("Enter a word: ");
            word = sc.next();

            int end = word.length() - 1;

            for (int start = 0; start < word.length() - 1; start++) {
                if (start == end || start > end) {
                    System.out.println("Word is a palindrome.\n");
                    break;
                }
                else if (word.charAt(start) == word.charAt(end)) {
                    --end;
                } else {
                    System.out.println("Word is not a palindrome.\n");
                    break;
                }
            }
            System.out.println("Do you want to check another word?\nEnter \"y\" to keep going.");
            char toContinue = sc.next().charAt(0);
            if (toContinue == 'y' || toContinue == 'Y')
                keepGoing = true;
            else
            {
                keepGoing = false;
            }
        }
        while (keepGoing);

    }
}
