package Strings;

public class NumberOfVowelsandConsonests {
    public static void main(String[] args) {
        String s="aasoij#%$T&%#%#%)(%)KJhjghd=ssb";

        int vowels=0, consonents=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(isVowel(ch)){
                vowels++;
            }else if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                consonents++;
            }

           
        }
        System.out.print(vowels+" "+consonents);
    }

    private static boolean isVowel(char ch) {
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        return true;
    } else {
        return false;
    }
    }
}
