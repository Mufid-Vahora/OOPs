import java.util.Scanner;
class Vowelsswitch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int flag='\0';
        int vowels=0;
        int consonant=0;
        int digit=0;
        System.out.println("Enter a String:");
        a=sc.nextLine();        //user entered string
        for(int i=0;i<a.length();++i)
        {
            char ch=a.charAt(i);    //gets the character at the position
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                flag=1;
            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                flag=2;
            else if(ch>='1'&&ch<='9')
                flag=3;
            switch(flag)    
            {
                case 1: vowels++;
                    break;
                case 2: consonant++;
                    break;
                case 3: digit++;
                    break;
            }
            flag=0;
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonant);
        System.out.println("Digits:"+digit);
    }
}
