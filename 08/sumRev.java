import java.util.Scanner;

class SumRev {
    // declare variables
    int a, m = 0, sum = 0;

    // function to find and display sum of digits
    void sum(int num) {
        do {
            a = num % 10;
            sum = sum + a;
            num = num / 10;
        } while (num > 0);

        System.out.println("Sum of digits = " + sum);
    }

    // function to find and display reverse
    void reverse(int num) {
        do {
            a = num % 10;
            m = m * 10 + a;
            num = num / 10;
        } while (num > 0);

        System.out.println("Reverse : " + m);
    }
}

class SumRevMain {
    public static void main(String[] args) {

        // declare variables
        int n;

        // Scanner class object to read input values
        Scanner sc = new Scanner(System.in);

        // read a number from user
        System.out.print("Enter any number : ");
        n = sc.nextInt();

        // create an object of class SumRev and call functions
        SumRev obj = new SumRev();
        obj.sum(n);
        obj.reverse(n);
    }
}