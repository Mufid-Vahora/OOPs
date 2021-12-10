import java.util.Scanner;

class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int end = 0;
        int st = 0; // variables storing the start and end positions of words
        // System.out.println("Enter a string:");
        str = sc.nextLine();
        while (end <= str.length() - 1) {
            char ch = str.charAt(end);
            if (ch == ' ' || end == str.length() - 1) // checks if end of string is reached or space has occured
            {
                if (end == str.length() - 1)
                    System.out.print(str.charAt(end));
                for (int i = end - 1; i >= st; --i) {
                    System.out.print(str.charAt(i));
                }
                System.out.print(' ');
                st = end + 1;
            }
            end++;
        }
    }
}
