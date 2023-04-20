import java.util.Scanner;

class HcfLcm {
    public static void main(String args[]) {

        // declare variables
        int temp1, temp2, a, b, temp, hcf, lcm;

        // Scanner class object to read input values
        Scanner scanner = new Scanner(System.in);

        // read two numbers from user
        System.out.print("Enter First Number: ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        b = scanner.nextInt();

        // find hcf
        temp1 = a;
        temp2 = b;
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;

        // find lcm
        lcm = (a * b) / hcf;

        // display hcf and lcm
        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
    }
}