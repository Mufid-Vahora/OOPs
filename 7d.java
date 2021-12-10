import java.util.Scanner;

class CountSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int[] c = new int[100]; // array storing count of sentences
        String[] sub = new String[100];
        String[] temp;
        int j = 0;
        c[j] = 0;
        int l = str.length();
        for (int i = 0; i < l; ++i) {
            char ch = str.charAt(i);

            if (ch == '.' || ch == '?' || ch == '!') {
                if (ch == '?') {
                    temp = str.split("\\?", 2);
                } else if (ch == '.')
                    temp = str.split("\\.", 2);
                else
                    temp = str.split("\\!", 2);
                sub[j] = temp[0]; // stores the sentence str=temp[1]; //appendes the remaining string
                                  // l=str.length();
                i = 0;
                ++j;
                c[j] = 0;
                continue;
            }
            c[j]++;
        }
        for (j = 0; c[j] != 0; ++j) {
            System.out.print("String " + (j + 1) + "=" + sub[j]);
            System.out.println(",count=" + c[j]);
        }
    }
}
