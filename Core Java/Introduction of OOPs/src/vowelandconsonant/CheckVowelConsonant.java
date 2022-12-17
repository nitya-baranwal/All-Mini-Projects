package vowelandconsonant;

public class CheckVowelConsonant {

        char ch;
        public static void main(String[] args) {
                CheckVowelConsonant ch1 = new CheckVowelConsonant();
                ch1.ch = 'a';
                ch1.checkVorC(ch1.ch);

                CheckVowelConsonant ch2 = new CheckVowelConsonant();
                ch2.ch = 'C';
                ch2.checkVorC(ch2.ch);

                CheckVowelConsonant ch3 = new CheckVowelConsonant();
                ch3.ch = '2';
                ch3.checkVorC(ch3.ch);

        }

        void checkVorC(char ch) {
                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                                System.out.println(ch + " is a vowel");
                        } else {
                                System.out.println(ch + " is a consonant");
                        }
                } else {
                        System.out.println(ch + " is an invalid character");
                }
        }

}
