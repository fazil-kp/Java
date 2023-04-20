import java.util.Scanner;

class VowelRem {
    public static void main(String args[]) {

        // create object of class to call function
        VowelRem obj = new VowelRem();

        // declare strings
        String str, removedString = "";

        // Scanner class object to read input values
        Scanner sc = new Scanner(System.in);

        // get string from user
        System.out.print("Enter a String : ");
        str = sc.nextLine();

        // convert string to lowercase
        str = str.toLowerCase();

        // scan each character and insert
        // non-vowel characters into new string
        for (int i = 0; i < str.length(); i++) {
            if (!obj.isVowel(str.charAt(i))) {
                removedString = removedString + str.charAt(i);
            }
        }

        // display result string
        System.out.print("String after removing vowels : ");
        System.out.print(removedString);
    }

    // function to check if a character is vowel or not
    public boolean isVowel(char c) {
        String vowels = "aeiou";
        for (int i = 0; i < 5; i++) {
            if (c == vowels.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}