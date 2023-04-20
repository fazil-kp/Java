import java.util.Scanner;

class JavaProgram {
    public static void main(String[] input) {

        // declare variables
        String str1, str2;
        int len, len1, len2, i, j, flag = 0;

        // Scanner class object to read input values
        Scanner scan = new Scanner(System.in);

        // read two strings from user
        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        // if two strings are of same length
        // check if the strings are anagram to each other
        if (len1 == len2) {
            len = len1;
            for (i = 0; i < len; i++) {
                flag = 0;
                for (j = 0; j < len; j++) {
                    // set flag = 1 and break from loop, if i-th charcter in first string
                    // is found in second string
                    if (str1.charAt(i) == str2.charAt(j)) {
                        flag = 1;
                        break;
                    }
                }
                // flag = 0, it indicates that some character in first string 
                // is not present in second string
                if (flag == 0) {
                    break;
                }
            }
            if (flag == 0) {
                System.out.print("Strings are not Anagram to Each Other..!!");
            } else {
                System.out.print("Strings are Anagram");
            }
        } else {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }
    }
}