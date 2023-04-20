import java.util.Scanner;
public class baseConversion{
	public static void main(String args[]) {
        // declare variables
        int num,index=0;
        int binary[] = new int[40];
        // Scanner class object to read input values
        Scanner in = new Scanner(System.in);
        // read integer number from user
        System.out.print("Enter an integer : ");
        num = in.nextInt();
        // convert to binary and display
        int temp1 = num;
        while (temp1 > 0) {
            binary[index] = temp1 % 2;
            temp1 = temp1 / 2;
            index++;
        }
        System.out.print("Binary of given integer is: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        // convert to octal and display
        int temp2 = num, rem = 0;
        String octal = "";
        char octalchars[] = { '0', '1', '2', '3', '4', '5', '6', '7' };
        while (temp2 > 0) {
            rem = temp2 % 8;
            octal = octalchars[rem] + octal;
            temp2 = temp2 / 8;
        }
        System.out.println("\nOctal of given integer is: " + octal);
        // convert to hex and display
        int temp3 = num;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        while (temp3 > 0) {
            rem = temp3 % 16;
            hex = hexchars[rem] + hex;
            temp3 = temp3 / 16;
        }
        System.out.println("Hexadecimal of given integer is: " + hex);
    }
       

}